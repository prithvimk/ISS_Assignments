-- Creating a stored procedure
DELIMITER &&

CREATE PROCEDURE getCustomerCount()
BEGIN
    DECLARE customerCount INT;
    SELECT COUNT(*) INTO customerCount FROM customers;
    SELECT customerCount;
END &&

DELIMITER ;

-- Calling the stored procedure
CALL getCustomerCount();
