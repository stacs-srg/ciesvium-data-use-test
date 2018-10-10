package uk.ac.standrews.cs.test;
import uk.ac.standrews.cs.data.ExampleDataSet;
import uk.ac.standrews.cs.utilities.dataset.DataSet;

public class ExampleDataSetUse {

    public static void main(String[] args) throws Exception {

        DataSet my_data = new ExampleDataSet();
        my_data.print(System.out);
    }
}