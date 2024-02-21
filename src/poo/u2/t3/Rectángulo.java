package poo.u2.t3;
class Rectángulo {
    double ancho ;
    double altura ;
    double area ;
    double perimetro ;

    Rectángulo(double ancho, double altura) {
        this.ancho = ancho ;
        this.altura = altura ;
    }
    double area (){
        return ancho*altura ;
    }

    double perimetro () {
        return (2*ancho)+(2*altura) ;
    }
}
