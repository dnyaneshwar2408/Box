class box{
    double weight;
    double depth;
    double height;
    double width;
    double volume(){
        return width*height*depth;
    }
     box (double a,double b,double c,double d){
        weight =a;
        depth=b;
        height=c;
        width=d;
    }
}