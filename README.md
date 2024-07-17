# Automation Script

This project automates a typical user journey on an eCommerce website using Selenium in Java. The automation script covers various functionalities including adding products to the cart, user registration, and placing an order.

## Tools

- Java 8 or higher
- ChromeDriver


## Project Structure

- **src/**: Contains the source code.
- **pom.xml**: Maven configuration file.

# Test Scenario
The script automates the following steps:

1. Launch browser (Chrome)
2. Navigate to URL 'http://automationexercise.com'
3. Verify that the home page is visible successfully
4. Add products to the cart
5. Click the 'Cart' button
6. Verify that the cart page is displayed
7. Click Proceed To Checkout
8. Click the 'Register / Login' button
9. Fill all details in Sign up and create an account
10. Verify 'ACCOUNT CREATED!' and click the 'Continue' button
11. Verify 'Logged in as username' at top
12. Click the 'Cart' button
13. Click the 'Proceed To Checkout' button
14. Verify Address Details and Review Your Order
15. Enter the description in a comment text area and click 'Place Order'
16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
17. Click the 'Pay and Confirm Order' button
18. Verify the success message 'Your order has been placed successfully!'

## Dependencies

- Selenium
- WebDriverManager

