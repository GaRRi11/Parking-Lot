package org.example.storage.model.vehicle;

public abstract class Vehicle {
     String licenseNo;

    abstract void assignTicket();

    //This approach is not proficient for object-oriented design
    // because if we want to add one more vehicle type later in
    // our system, then we would need to update the code in multiple
    // places in our code, and this would violate the Open Closed
    // principle of the SOLID design principle. This is because the
    // Open Closed principle states that classes can be extended but
    // not modified. Therefore, it is recommended not to use the
    //enumeration data type as it is not a scalable approach.
}
