README
# Introduccion
En el presente proyecto se desarrollan los tests propuestos para la prueba de automatizacion con Sophos, el primer test es una prueba UI donde se accede al portal https://www.metro.pe/especiales/cybermetro y se realiza la busqueda del producto lavadora, finalmente se agrega al carrito y se verifica la existencia del producto en el carrito de compras. Si desea cambiar el producto buscado ingrese al archivo /RetoSophos/src/test/resources/com/google/www/features/products_purchase.feature y sustituya la palabra "lavadora" en el escenario por cualquier otro producto.
En el segundo test se prueba una de las APIs proporcionadas en la pagina https://gorest.co.in/ en particular consultar un usuario especifico. Desde la feature /RetoSophos/src/test/resources/com/google/www/features/consult_users.feature se establecen tres nombres de usuarios a buscar, esto ocasiona 3 tests. Se pueden modificar los nombres o agregar nuevos.

# Test
El comando para ejecutar las pruebas es gradle test -i aggregate. Este comando genera un archivo index.html en la ruta target\site\serenity\index.html desde el cual se podrá ver y navegar a través del reporte de las pruebas generado por la herramienta Serenity.
