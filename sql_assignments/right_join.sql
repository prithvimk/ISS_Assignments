SELECT products.product_id, products.name, quantity
FROM order_items
RIGHT JOIN products
	ON order_items.product_id = products.product_id