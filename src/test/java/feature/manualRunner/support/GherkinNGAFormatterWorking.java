
package feature.manualRunner.support;

import cucumber.runtime.CucumberException;
import cucumber.runtime.formatter.StrictAware;
import gherkin.formatter.Formatter;
import gherkin.formatter.Reporter;
import gherkin.formatter.model.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class GherkinNGAFormatterWorking implements Formatter, Reporter, StrictAware {

    public static final String RESULTS_FILE_NAME = "gherkinNGAResults.xml_";
    public static final String ROOT_TAG_NAME = "features";
    public static final String FILE_TAG_NAME = "file";
    public static final String TEST_CLASSES_DIR_NAME = "test-classes";

    private Document _doc = null;
    private Element _rootElement = null;
    private Writer _out;

    public GherkinNGAFormatterWorking() {
        try {
            _doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            _rootElement = _doc.createElement(ROOT_TAG_NAME);
            _doc.appendChild(_rootElement);
            _out = new FileWriter(RESULTS_FILE_NAME);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void uri(String uri) {
        // URI featureFileURI = new URI(uri);
        //todo: try use uri and maybe things will be better with file path and save the need to use String.replace down there.
        System.out.println("******************************************************* URI CALLED WITH: " + uri + " ******************************************");
        appendFeatureFile(uri);
    }

    private void appendFeatureFile(String featureFileSubPath) {
        try {
            URL url = GherkinNGAFormatterWorking.class.getResource(GherkinNGAFormatterWorking.class.getSimpleName() + ".class");
            File classFile = new File(url.toURI());
            File testClassesDir = getTestClassesDirFromPath(classFile);
            File featureFile = new FileFinder().findFile(testClassesDir, featureFileSubPath);

            byte[] encoded = Files.readAllBytes(featureFile.toPath());
            String fileStr = new String(encoded, StandardCharsets.UTF_8);
            Element fileElement = _doc.createElement(FILE_TAG_NAME);
            fileElement.appendChild(_doc.createCDATASection(fileStr));
            _rootElement.appendChild(fileElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class FileFinder {
        private ArrayList<File> _resultFiles = new ArrayList<>();

        public File findFile(File rootDir, String fileName) {
            find(rootDir, fileName);

            if(_resultFiles.size() == 0) {
                throw new CucumberException("Didn't find the feature file " + fileName + " in the path: " + rootDir);
            } else if(_resultFiles.size() > 1) {
                throw new CucumberException("found " + _resultFiles.size() + " feature files named " + fileName + " in the path: " + rootDir);
            }

            return _resultFiles.get(0);
        }

        private void find(File rootDir, String fileName) {
            File[] files = rootDir.listFiles();

            if(files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        find(file, fileName);
                    } else if (file.getAbsolutePath().endsWith(fileName) || file.getAbsolutePath().endsWith(fileName.replace('/', File.separatorChar))) {
                        _resultFiles.add(file);
                    }
                }
            }
        }
    }

    private static File getTestClassesDirFromPath(File file) {
        while(!file.getAbsolutePath().endsWith(TEST_CLASSES_DIR_NAME)) {
            file = file.getParentFile();
        }
        return file;
    }

    @Override
    public void feature(Feature feature) {
        System.out.println("******************************************************** feature " + feature.getName() + " called *********************************************");
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

            StreamResult result = new StreamResult(_out);
            DOMSource source = new DOMSource(_doc);
            trans.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() {
        try {
            if(_out != null) {
                _out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eof() {

    }

    @Override
    public void setStrict(boolean b) {

    }

    //private class
}
