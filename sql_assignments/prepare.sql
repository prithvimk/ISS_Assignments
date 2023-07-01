-- Creating a prepared statement
SET @query = 'SELECT * FROM customers WHERE points > ?';
PREPARE stmt FROM @query;

-- Setting the parameter value
SET @pointsThreshold = 1000;

-- Executing the prepared statement
EXECUTE stmt USING @pointsThreshold;

-- Deallocating the prepared statement
DEALLOCATE PREPARE stmt;