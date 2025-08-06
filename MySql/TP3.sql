CREATE DATABASE IF NOT EXISTS TP3;

USE tp3;


SELECT * FROM customers;
SELECT * FROM employees;
SELECT * FROM offices;
SELECT * FROM orderdetails;
SELECT * FROM orders;
SELECT * FROM payments;
SELECT * FROM productlines;
SELECT * FROM products;

-- 1 :
SELECT firstName, lastName, jobTitle FROM employees ORDER BY lastName;
-- 2 :
SELECT DISTINCT LastName FROM employees;
-- 3 :
SELECT customerName, contactFirstName, contactLastName FROM customers WHERE country="USA";
-- 4 :
SELECT email FROM employees WHERE firstName LIKE "%y" AND reportsTo LIKE "105%";
-- 5 :
SELECT lastName, email FROM employees WHERE firstName LIKE "L%";
-- 6 :
SELECT * FROM customers ORDER BY contactLastName;
-- 7 :
SELECT * FROM employees ORDER BY officeCode;
-- 8 :
SELECT customerName, SUM(amount) FROM customers, payments WHERE customers.customerNumber = payments.customerNumber GROUP BY customerName HAVING SUM(amount) >100000;
-- 9 :
SELECT orders.orderNumber, SUM(quantityOrdered*priceEach)AS "total", status  FROM orders,orderdetails WHERE orders.orderNumber = orderdetails.orderNumber GROUP BY orderNumber, status ORDER BY status;
-- 10 :
SELECT orderNumber, products.productCode, productName, MSRP, priceEach FROM products, orderdetails WHERE products.productCode = orderdetails.productCode AND products.productCode = "S10_1678" HAVING MSRP > priceEach ;
-- 11 :
SELECT DISTINCT email, firstName, lastName FROM employees, offices WHERE firstName LIKE "%y" OR (employees.officeCode = offices.officeCode AND city = "San Francisco"); 
-- 12 :
SELECT COUNT(*) FROM employees, customers WHERE employeeNumber = 1165 AND employees.employeeNumber = customers.salesRepEmployeeNumber;
-- 13 :
SELECT  lastName, firstName FROM employees WHERE jobTitle = "President";
-- 14 :
SELECT SUM(priceEach*quantityOrdered) AS "Somme des montants des paiements reçus" FROM orders,orderdetails WHERE orderDate LIKE "2005-03%" AND orders.orderNumber = orderdetails.orderNumber;
-- 15 :
SELECT customers.customerNumber, contactLastName, SUM(amount) as "Montant des paiements" FROM customers, payments WHERE customers.customerNumber = payments.customerNumber GROUP BY customers.customerNumber;
-- 16 :
SELECT orderDate, customerNumber, status FROM orders WHERE status="Cancelled";
-- 17 :
SELECT firstName, lastName FROM employees WHERE reportsTo = 1143;
-- 18 :
SELECT firstName, lastName FROM employees WHERE reportsTo IS NULL;
-- 19 :
SELECT orderNumber, quantityOrdered as quantity FROM orderdetails GROUP BY orderNumber, quantityOrdered ORDER BY quantity LIMIT 1;
-- 20 :
SELECT orderdetails.orderNumber,productCode, quantityOrdered,priceEach,orderLineNumber, orderDate FROM orderdetails, orders WHERE orderDate = "2003-04-21" AND orders.orderNumber = orderdetails.orderNumber ;
-- 21 :

-- 22 :
