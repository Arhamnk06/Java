import java.io.*;
import java.util.*;

public class Lab8 {

    /**
     * This method should return numerator/denominator as double.
     * That is, 1/2 should correctly return 0.5 rather than
     * truncating.
     * 
     * If the denominator is zero, throw an ArithmeticException.
     * 
     * If the numerator and denominator are both zero, throw
     * an UnsupportedOperationException.
     * 
     */
    public static double divideNumbers(int numerator, int denominator) {
        if (numerator == 0 && denominator == 0) {
            throw new UnsupportedOperationException();
        }
        if (denominator == 0) {
            throw new ArithmeticException();
        }
        return (double) numerator / denominator;
    }

    /**
     * This method converts a temperature from Celsius to Fahrenheit 
     * and validates the input.
     * 
     * If the String celciusTemp cannot be parsed as a number, you
     * should throw a NumberFormatException.
     * 
     * If celciusTemp is below absolute zero (-273.15°C), you should
     * throw an InvalidTemperatureException. Note that this does not 
     * exist, you should create it! Refer to the example in the slides 
     * for how this can be done.
     * 
     * The InvalidTemperatureException should be created as a static
     * nested class inside this Lab8 class.
     */
    public static double convertCelsiusToFahrenheit(String celsiusTemp) {
        if (celsiusTemp == null) {
            throw new NumberFormatException();
        }

        double temp;
        try {
            temp = Double.parseDouble(celsiusTemp);
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }

        if (temp < -273.15) {
            throw new InvalidTemperatureException("Below absolute zero.");
        }

        return temp * 9.0 / 5.0 + 32;
    }

    public static class InvalidTemperatureException extends RuntimeException {
        public InvalidTemperatureException(String message) {
            super(message);
        }
    }

    /**
     * This method should open the plain text file named fname_in and 
     * return, as a String, lines first to last, inclusive.
     * 
     * If first or last are negative, or if last is less than first,
     * throw a Negative­Array­Size­Exception
     * 
     * If first is larger than the number of lines in the file, 
     * throw an Index­Out­Of­Bounds­Exception
     * 
     * if last is larger than the number of lines in the file, then
     * return a string containing lines first to the end of the file.
     * 
     * You may assume that fname_in is a file that exists.
     */
    public static String file_slice(String fname_in, int first, int last) {
        if (first < 0 || last < 0 || last < first) {
            throw new NegativeArraySizeException();
        }

        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fname_in))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            return "";
        }

        if (first >= lines.size()) {
            throw new IndexOutOfBoundsException();
        }

        int end = Math.min(last, lines.size() - 1);
        StringBuilder result = new StringBuilder();
        for (int i = first; i <= end; i++) {
            result.append(lines.get(i));
            if (i < end) {
                result.append("\n");
            }
        }

        return result.toString();
    }

    /**
     * This method should open the plain text file named fname_in and 
     * produce a new file whose name is fname_out. The output file 
     * should contain the lines from the input file in reverse order.
     * Additionally, the characters on each line should also be in
     * reverse order. 
     * 
     * Finally, the contents of the output file should also be returned
     * as a String.
     * 
     * If fname_in does not exist, return "ERROR: NO INPUT"
     * If fname_out fails to open, you should still return the 
     * reversed contents as a String as usual.
     */
    public static String rev_rev_file(String fname_in, String fname_out) {
        if (fname_in == null || fname_in.isEmpty()) {
            return "ERROR: NO INPUT";
        }

        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fname_in))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            return "ERROR: NO INPUT";
        }

        StringBuilder result = new StringBuilder();
        for (int i = lines.size() - 1; i >= 0; i--) {
            result.append(new StringBuilder(lines.get(i)).reverse());
            if (i > 0) {
                result.append("\n");
            }
        }

        try {
            if (fname_out != null && !fname_out.isEmpty()) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fname_out));
                writer.write(result.toString());
                writer.close();
            }
        } catch (IOException e) {
            // writing failed — still return content as required
        }

        return result.toString();
    }
}