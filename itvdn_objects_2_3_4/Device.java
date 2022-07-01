package itvdn_objects_2_3_4;

import java.util.Objects;

public class Device {
   protected String manufacturer;
   protected float price;
   protected String serialNumber;

   public Device(String manufacturer, float price, String serialNumber) {
      this.manufacturer = manufacturer;
      this.price = price;
      this.serialNumber = serialNumber;
   }

   public String getManufacturer() {
      return manufacturer;
   }

   public float getPrice() {
      return price;
   }

   public String getSerialNumber() {
      return serialNumber;
   }

   @Override
   public String toString() {
      return "Device: " + "manufacturer = " + manufacturer + ", price = " + price + ", serialNumber =" + serialNumber;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Device device = (Device) o;
      return Float.compare(device.price, price) == 0 && manufacturer.equals(device.manufacturer) && serialNumber.equals(device.serialNumber);
   }

   @Override
   public int hashCode() {
      return Objects.hash(manufacturer, price, serialNumber);
   }
}
