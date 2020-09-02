package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        DeliveryService deliveryServiceForHeavyPackage = new HeavyPackageDeliveryService();
        NotificationService notificationServiceForHeavyPackage = new HeavyPackageNotificationService();
        ShippingCenter shippingCenter1 = new ShippingCenter(deliveryServiceForHeavyPackage, notificationServiceForHeavyPackage);
        shippingCenter1.sendPackage("Hill Street 11, New York", 28.2);

        DeliveryService deliveryServiceForLightPackage = new LightPackageDeliveryService();
        NotificationService notificationServiceForLightPackage = new LightPackageNotificationService();
        ShippingCenter shippingCenter2 = new ShippingCenter(deliveryServiceForLightPackage, notificationServiceForLightPackage);
        shippingCenter2.sendPackage("Hill Street 1456, New York", 8.2);
    }
}