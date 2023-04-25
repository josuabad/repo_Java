En una aplicación de gestión de una tienda online de productos electrónicos, se necesita implementar una jerarquía de clases que representen los diferentes tipos de productos que se venden en la tienda.
Todos los productos tienen un nombre, un precio y un número de unidades disponibles en el stock de la tienda.

La tienda vende tres tipos de productos electrónicos: teléfonos móviles, televisores y portátiles. Cada uno de ellos tiene características específicas:

+ Los teléfonos móviles tienen una marca, un modelo, una pantalla y una batería.
+ Los televisores tienen una marca, un modelo, un tamaño de pantalla y una resolución.
+ Los portátiles tienen una marca, un modelo, una pantalla, una batería y un procesador.

Todos los productos electronicos se podrán encender y apagar y solo los móviles y los potátiles se podrán reiniciar.

Además, se necesita implementar un sistema de descuentos para los clientes que compren varios productos de una misma categoría. El descuento se aplica de la siguiente forma:

Clase cliente con id, dni y carro de la compra
    Si un cliente compra dos telefonos móviles, se le aplica un descuento del 5% sobre el precio total de los dos teléfonos.
    Si un cliente compra dos televisores, se le aplica un descuento del 10% sobre el precio total de los dos televisores.
    Si un cliente compra dos portátiles, se le aplica un descuento del 15% sobre el precio total de los dos portátiles.

Se pide implementar la jerarquía de clases que representen los productos electrónicos de la tienda, así como el sistema de descuentos. Se deberán crear al menos dos objetos de cada tipo de producto y aplicar el descuento correspondiente.
Finalmente, se deberá imprimir por pantalla el precio total de la compra aplicando los descuentos.
Después de la compra el cliente encenderá todos los aparatos y reiniciará solo aquellos que se puedan reiniciar