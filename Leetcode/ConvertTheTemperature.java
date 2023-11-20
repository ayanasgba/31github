class Solution {
    public double[] convertTemperature(double celsius) {
        double[] res = new double[2];

        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.8 + 32.00;

        res[0] = kelvin;
        res[1] = fahrenheit;

        for (double value : res) {
            System.out.println(value);
        }

        return res;
    }
}
