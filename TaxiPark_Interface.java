package _10_Interfaces;


import _10.CarSegments;
import _12.NegativeSpeedException;

public interface TaxiPark_Interface {
    public int CostOfAllCars();
    public void sortByFuelConsumption();
    public CarSegments[] getCarsByMaxSpeed(int min, int max) throws NegativeSpeedException;
    public CarSegments[] arrayCopyAndPlusOneElement(CarSegments[] car);
    public CarSegments[] removingElementByIndex(CarSegments [] cars ,int index);
}
