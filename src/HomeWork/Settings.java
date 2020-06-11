package HomeWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.stream.Stream;

public class Settings {

    private String filePath = "./in/settings";
    private Properties props = getProps();
    private int [] guessANumberRange;
    private int guessANumberTriesCount;
    private boolean guessANumberIsRepeat;

    private static Properties loadSettingsFromFile(String filePath){
        File configFile = new File(filePath);
        Properties props = new Properties();

        try {
            FileReader reader = new FileReader(configFile);
            props.load(reader);
            reader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println("IO error");
        } catch (Exception ex){
            System.out.println("Undefined exception");
        }

        return props;
    }

    public int[] getGuessANumberRange() {
        return  Stream.of(props.getProperty("guessANumberRange").split(","))
                .mapToInt(Integer::parseInt).toArray();
    }

    public void setGuessANumberRange(int[] guessANumberRange) {
        this.guessANumberRange = guessANumberRange;
    }

    public int getGuessANumberTriesCount() {
        return Integer.parseInt(props.getProperty("guessANumberTriesCount"));
    }

    public void setGuessANumberTriesCount(int guessANumberTriesCount) {
        this.guessANumberTriesCount = guessANumberTriesCount;
    }

    public boolean isGuessANumberIsRepeat() {
        return "true".equals(props.getProperty("guessANumberIsRepeat"));
    }

    public void setGuessANumberIsRepeat(boolean guessANumberIsRepeat) {
        this.guessANumberIsRepeat = guessANumberIsRepeat;
    }

    public Properties getProps() {
        return loadSettingsFromFile(filePath);
    }

    public void setProps(Properties props) {
        this.props = props;
    }
}
