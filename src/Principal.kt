
var rango = 0..5
class Persona (var id: Int, var nombre: String, var edad: Int)

var listaPersona =  ArrayList<Persona>()


fun main() {

    /*for(n in rango){
        println(n)
    }*/

    crearPersona("elder",39)
    crearPersona("juan",50)
    crearPersona("daniel",69)
    modificarPersona(1, 80)
    visualizarPersona()
}

fun crearPersona(nomnre: String, edad: Int){

    listaPersona.add(Persona(listaPersona.count() + 1, nomnre, edad))
}

fun modificarPersona(id: Int, edad: Int){

    listaPersona.filter{p1 -> p1.id == id}
        .forEach{p ->p.edad = edad}

}

fun visualizarPersona(){

    listaPersona.filter{p1 -> p1.edad > 30}
        .sortedByDescending { p -> p.edad }
        .forEach { p -> println(String.format("%s, %s, %d", p.id, p.nombre, p.edad))  }
}