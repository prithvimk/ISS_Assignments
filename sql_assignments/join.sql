SELECT order_id, products.name, quantity, order_items.unit_price
FROM order_items
JOIN products
	ON order_items.product_id = products.product_id