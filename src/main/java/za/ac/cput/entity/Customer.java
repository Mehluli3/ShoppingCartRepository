package za.ac.cput.entity;
//Author: Damian Du Toit (219200203)


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

//Customer class (main class)
@Entity
public class Customer implements Serializable
{
    //Declarations
    @Id
    private int cusId;
    private String cusName, cusPhoneNum, cusEmail, cusPassword, shippingAddress1, shippingAddress2;

    private Customer(Builder builder)
    {
        this.cusId = builder.cusId;
        this.cusName = builder.cusName;
        this.cusPhoneNum = builder.cusPhoneNum;
        this.cusEmail = builder.cusEmail;
        this.cusPassword = builder.cusPassword;
        this.shippingAddress1 = builder.shippingAddress1;
        this.shippingAddress2 = builder.shippingAddress2;
    }
    protected Customer()
    {

    }
    
    //Builder Class
    public static class Builder
    {
        private int cusId;
        private String cusName, cusPhoneNum, cusEmail, cusPassword, shippingAddress1, shippingAddress2;

        public Builder cusId(int cusId)
        {
            this.cusId = cusId;
            return this;
        }

        public Builder cusName(String cusName)
        {
            this.cusName = cusName;
            return this;
        }

        public Builder cusPhoneNum(String cusPhoneNum)
        {
            this.cusPhoneNum = cusPhoneNum;
            return this;
        }

        public Builder cusEmail(String cusEmail)
        {
            this.cusEmail = cusEmail;
            return this;
        }

        public Builder cusPassword(String cusPassword)
        {
            this.cusPassword = cusPassword;
            return this;
        }

        public Builder shippingAddress1(String shippingAddress1)
        {
            this.shippingAddress1 = shippingAddress1;
            return this;
        }

        public Builder shippingAddress2(String shippingAddress2)
        {
            this.shippingAddress2 = shippingAddress2;
            return this;
        }

        public Customer build()
        {
            return new Customer(this);
        }

        //Builder Copy
        public Builder copy(Customer customer)
        {
            this.cusId = customer.cusId;
            this.cusName = customer.cusName;
            this.cusPhoneNum = customer.cusPhoneNum;
            this.cusEmail = customer.cusEmail;
            this.cusPassword = customer.cusPassword;
            this.shippingAddress1 = customer.shippingAddress1;
            this.shippingAddress2 = customer.shippingAddress2;
            return this;
        }
    }

    //toString()
    @Override
    public String toString() {
        return "Customer Id: " + cusId + "\nCustomer Name: " + cusName +
                "\nCustomer Phone Number: " + cusPhoneNum + "\nCustomer Email: " +
                cusEmail + "\nCustomer Password: " + cusPassword + "\nShipping Address 1: " +
                shippingAddress1 + "\nShipping Address 2: " + shippingAddress2;
    }
}
