import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.provider.MethodSource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class StutterTest
{
    private BufferedReader infile;
    public StutterTest(BufferedReader infile)
    {
        this.infile = infile;
    }
    // The following values are from the 1st edition, Table 2.4, page 59
    // Need an update to the new edition table number and page number.
    @Test
    public void testTextFlow()
    {
        Assertions.assertThrows(FileNotFoundException.class,
                () -> {
                    Stutter.main("text3.txt");

                });
    }
}
