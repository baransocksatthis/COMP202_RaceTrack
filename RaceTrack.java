public class RaceTrack {
    public static void main(String[]args){
        //Calculating the area whole circle is going to cover
        double outerDiameter = Double.parseDouble(args[0]);
        double totalArea = Math.PI * Math.pow(outerDiameter,2);
        //Calculating the area the lanes are going to cover
        int lanes = Integer.parseInt(args[1]);
        double laneWidth = lanes * 2.8;
        //Calculating the inner circle
        double innerDiameter = outerDiameter - laneWidth;
        double innerArea = Math.PI * Math.pow(innerDiameter,2);
        //Deducting the inner circle to have a ring
        double laneArea = totalArea - innerArea;
        //Calculating the bling
        double directCost = laneArea * 7.49;
        double costTaxes = directCost * 0.15;
        System.out.println("Total Area: " + laneArea );
        System.out.println("Subtotal: " + directCost + "$");
        System.out.println("Sales Tax (15%): " + costTaxes + "$");
        System.out.println("Total: " + (int)(Math.ceil(directCost + costTaxes)) + "$");
    }
}
