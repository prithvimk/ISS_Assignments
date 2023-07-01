SELECT *, quantity * unit_price AS total
FROM order_items
	WHERE order_id = 6
    ORDER BY total DESC