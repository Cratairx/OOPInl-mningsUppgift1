public class Palmer {

    // • Palmer: En palm behöver 0,5 liter kranvatten per dag * sin längd i meter. En palm som är 3
    //    meter hög behöver alltså 0,5 * 3 = 1,5 liter vatten/dag.
    // Palmen Laura, 5 meter hög
    double tapWaterNeeds;
    double heightOfPalm;

    public double amountOfWaterToGiveLaura(){
        return tapWaterNeeds * heightOfPalm;
    }

}
