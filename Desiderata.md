# Información extraída

## Clases a implementar
- Red (de autobuses)
- Línea (de la red)
- Parada (de cada Línea)
- DirecciónGPS (grados de una localización geográfica)

## Clase Red
### Atributos
- Linea [] lineas. Restricciones: lineas.length >= 2. El id de cada Línea debe ser único.

### Funciones
- getLinea(int id):Linea-> Dado el id de la línea, consultar dicha línea.
- addLinea(Linea linea):void->Añadir lineas a la red.
- removeLinea(int id):void-> Eliminar lineas de la red.
- infoParadas(DireccionGPS direccion, double radio):Linea[]-> dada una dirección expresada en GD y un radio expresado en metros, deberá
proporcionarse información sobre las líneas que tienen parada en dicho radio.
- getDistanciaParada(int id_Linea1, int id_Linea2):double-> conocer la distancia de una parada de una línea a una parada de otra línea.
- getLineas():Linea[]-> Obtener array con todas las líneas de la red.

## Clase Línea
### Atributos
- Int id
- Parada inicio
- Parada fin
- Parada [] paradas

### Restricciones
- Debe tener al menos 3 paradas, contando inicio y fin (paradas.length>=3).
- La distancia entre inicio y fin debe ser menor a 100m.
- Las paradas estarán unívocamente identificadas por un número de orden en el recorrido (comenzando desde el inicio de trayecto hacia el fin de trayecto).

### Funciones
- getParadas():Parada[]-> Obtener array con todas las paradas de una línea.
- addParada(Parada parada)
- removeParada(int orden)
- setInicio (Parada inicio)
- setFin (Parada fin)
- searchParada(DireccionGPS direccion) -> Se desea que se pueda consultar si una línea tiene parada cerca de una dirección GPS, definiendo cerca a una distancia menor de 200 metros.
- checkDistancia(Parada parada1, Parada parada2):double->Se desea conocer la distancia de una parada a otra de la línea.

## Clase Parada
### Atributos
- int orden
- DireccionGPS direccion

## Clase DireccionGPS
### Atributos
- double latitud_norte(>0)
- double latitud_sur(<0)
- double longitud_este(>0)
- double longitud_oeste(<0)

### Funciones
- getGradosSexagesimales():DireccionGPS-> n. Los grados decimales representan la
parte de minutos y segundos de los grados sexagecimales como la parte decimal de un número real
cuya parte entera está dada por los grados (2°15′23″ = 12° + 15(1/60)° + 23(1/3600)° ≈ 12,25639°).
- getDistancia():double-> Dadas 2 direcciones, obtener la distancia en metros entre ambas.

## Anotaciones
Antes de empezar a construir los test, especificar en concreto que es lo que debe devolver cada una de las funciones planteadas