package weekSix;
import java.lang.Math;
/*

Create the class NightSky, that has three object variables: density (double), width (int), and height (int). The class should have 3 constructors:

public NightSky(double density) creates a NightSky object with the given star density. Width gets the value 20 and height the value 10.
public NightSky(int width, int height) creates a NightSky object with the given width and height. Density gets the value 0.1.
public NightSky(double density, int width, int height) creates a NightSky-object with the given density, width and height
Add to the class NightSky the method printLine, that prints one line of starts. The line length is determined by the value of the instance variable width and the instance variable density determines the star probability. For each printed character you should use a Random object to decide if it prints out as a white space or a star. The method nextDouble will probably be of use now.

In the following example:

NightSky NightSky = new NightSky(0.1, 40, 10);
NightSky.printLine();


*/
public class NightSky {
    private double density;
    private int width;
    private int height;

    private int stars;

    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }
    public NightSky(double density){
        this.density = density;
        this.height = 10;
        this.width = 20;
    }
    public NightSky(int width, int height){
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }
    public void printLine(){
        for(int i = 0; i<this.width; i++){
            if(this.density > Math.random()){
                System.out.print("*");
                this.stars += 1;
            }
            System.out.print(" ");
        }
    }
    public void print(){
        this.stars = 0;
        for (int i = 0; i < this.height ; i++) {
            printLine();
            System.out.print("\n");
        }
    }
    public int starsInLastPrint(){
        return this.stars;
    }
}
