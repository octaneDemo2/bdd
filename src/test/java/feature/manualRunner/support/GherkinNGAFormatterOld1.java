
package feature.manualRunner.support;

import cucumber.runtime.CucumberException;
import cucumber.runtime.formatter.StrictAware;
import gherkin.formatter.Formatter;
import gherkin.formatter.Reporter;
import gherkin.formatter.model.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GherkinNGAFormatterOld1 implements Formatter, Reporter, StrictAware {

    public static final String RESULTS_FILE_NAME = "gherkinNGAResults.xml_";
    public static final String ROOT_TAG_NAME = "gherkin";
    public static final String FILE_TAG_NAME = "file";

    private final Document _doc;
    private final Element _rootElement;

    public GherkinNGAFormatterOld1() throws IOException, ParserConfigurationException {
        _doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        _rootElement = _doc.createElement(ROOT_TAG_NAME);
        _doc.appendChild(_rootElement);
    }

    @Override
    public void uri(String uri) {
       // URI featureFileURI = new URI(uri);
        //todo: try use uri and maybe things will be better with file path and save the need to use String.replace down there.
        appendFeatureFile(uri);
    }

    private void appendFeatureFile(String path) {
       // String location = GherkinNGAFormatter.class.getProtectionDomain().getCodeSource().getLocation().getFile();
        URL url = GherkinNGAFormatterOld1.class.getResource(GherkinNGAFormatterOld1.class.getSimpleName() + ".class");
        File file = null;
        try {
            file = new File(url.toURI());
            System.out.println(file.getAbsolutePath());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        //File featureFile = FileFinder.findFile(location, path);

//        byte[] encoded;
//
//        try {
//            encoded = Files.readAllBytes(featureFile.toPath());
//        } catch (IOException e) {
//            throw new CucumberException(e);
//        }
//        String fileStr = new String(encoded, StandardCharsets.UTF_8);
//        Element fileElement = _doc.createElement(FILE_TAG_NAME);
//        fileElement.appendChild(_doc.createCDATASection(fileStr));
//        _rootElement.appendChild(fileElement);
    }

    private static class FileFinder {
        private static ArrayList<File> _resultFiles = new ArrayList<>();

        public static File findFile(String rootDir, String fileName) {
            //System.out.println(rootDir);
            find(rootDir, fileName);

            if(_resultFiles.size() == 0) {
                throw new CucumberException("Didn't find the feature file " + fileName + " in the path: " + rootDir);
            } else if(_resultFiles.size() > 1) {
                throw new CucumberException("found " + _resultFiles.size() + " feature files named " + fileName + " in the path: " + rootDir);
            }

            return _resultFiles.get(0);
        }

        private static void find(String rootDir, String fileName) {
            File root = new File(rootDir);
            File[] files = root.listFiles();

            if(files != null) {
                for (File file : files) {
                    // System.out.println(file);
                    if (file.isDirectory()) {
                        find(file.getAbsolutePath(), fileName);
                    } else if (file.getAbsolutePath().endsWith(fileName) || file.getAbsolutePath().endsWith(fileName.replace('/', File.separatorChar))) {
                        _resultFiles.add(file);
                    }
                }
            } else {
                throw new CucumberException("Can't list files. root dir: " + rootDir);
            }
        }

//        public static String getTestClassesDirFromPath(String location) {
//            File locFile = new File(location);
//            String filePath = locFile.getAbsolutePath();
//            System.out.println(filePath);
//            Path path = Paths.get(filePath);
//            System.out.println(path);
//
////            String[] pathParts = filePath.split(File.separator);
////            StringBuilder testClassesPath = new StringBuilder();
////            for(String dirName : pathParts) {
////                testClassesPath.append(dirName.toString());
////                testClassesPath.append(File.separator);
////                if(dirName.equals("test-classes")) {
////                    break;
////                }
////            }
////            System.out.println(testClassesPath);
////            return testClassesPath.toString();
//            return "C:\\Users\\alm_alm_auto\\IdeaProjects\\Gherkin\\target\\test-classes";
//        }
    }




    @Override
    public void feature(Feature feature) {
       // System.out.println("******************************************************** feature " + feature.getName() + " called *********************************************");
    }

    @Override
    public void before(Match match, Result result) {

    }

    @Override
    public void result(Result result) {

    }

    @Override
    public void after(Match match, Result result) {

    }

    @Override
    public void match(Match match) {

    }

    @Override
    public void embedding(String s, byte[] bytes) {

    }

    @Override
    public void write(String s) {

    }

    @Override
    public void syntaxError(String s, String s1, List<String> list, String s2, Integer integer) {

    }

    @Override
    public void scenarioOutline(ScenarioOutline scenarioOutline) {

    }

    @Override
    public void examples(Examples examples) {

    }

    @Override
    public void startOfScenarioLifeCycle(Scenario scenario) {

    }

    @Override
    public void background(Background background) {

    }

    @Override
    public void scenario(Scenario scenario) {

    }

    @Override
    public void step(Step step) {

    }

    @Override
    public void endOfScenarioLifeCycle(Scenario scenario) {

    }

    @Override
    public void done() {
        try {
            TransformerFactory transfac = TransformerFactory.newInstance();
            Transformer trans = transfac.newTransformer();
            trans.setOutputProperty(OutputKeys.INDENT, "yes");

            StreamResult result = new StreamResult(new FileWriter(RESULTS_FILE_NAME));
            DOMSource source = new DOMSource(_doc);
            trans.transform(source, result);
        } catch (TransformerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    private void createOutputFile(String featureName) {
//        String fileName = featureName + "-feature.xml";
//        try {
//            _out = new FileWriter(fileName);
//            System.out.println("out file created with name: " + fileName);
//        } catch(IOException e) {
//            throw new CucumberException("Error creating output file " + fileName, e);
//        }
//    }

    @Override
    public void close() {
//        try {
//            if(_out != null) {
//                _out.close();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void eof() {

    }

    @Override
    public void setStrict(boolean b) {

    }

    //private class
}
