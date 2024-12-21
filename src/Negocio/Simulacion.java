package Negocio;

import javafx.animation.AnimationTimer;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Simulacion {
    private Rectangle rio;
    private Rectangle fondoVerde;
    private Circle turbina;
    private Rectangle casa;
    private Polygon techo;
    private Rectangle puerta;
    private Circle led;
    private TranslateTransition flujoRio;
    private RotateTransition rotacionTurbina;
    private boolean simulacionIniciada = false;

    public void iniciarSimulacion(Pane root) {
        crearElementos(root);
        agregarBotonIniciar(root);
    }

    private void crearElementos(Pane root) {
        // Fondo verde (terreno)
        fondoVerde = new Rectangle(0, 200, 800, 50);
        fondoVerde.setFill(Color.LIGHTGREEN);
        root.getChildren().add(fondoVerde);

        // Río
        rio = new Rectangle(0, 250, 800, 100);
        rio.setFill(Color.DODGERBLUE);
        root.getChildren().add(rio);

        // Turbina (junto al río)
        turbina = new Circle(100, 300, 40, Color.GRAY);
        root.getChildren().add(turbina);

        // Casa
        casa = new Rectangle(600, 100, 150, 150);
        casa.setFill(Color.BROWN);
        root.getChildren().add(casa);

        // Techo de la casa
        techo = new Polygon();
        techo.getPoints().addAll(
            600.0, 100.0, // Punto izquierdo
            750.0, 100.0, // Punto derecho
            675.0, 50.0   // Pico superior
        );
        techo.setFill(Color.DARKRED);
        root.getChildren().add(techo);

        // Puerta de la casa
        puerta = new Rectangle(660, 200, 30, 50);
        puerta.setFill(Color.BLACK);
        root.getChildren().add(puerta);

        // LED sobre la casa
        led = new Circle(675, 75, 15, Color.DARKGRAY);
        root.getChildren().add(led);

        // Paletas de la turbina
        for (int i = 0; i < 4; i++) {
            Line paleta = new Line(100, 300, 100 + 30 * Math.cos(Math.PI / 2 * i), 300 + 30 * Math.sin(Math.PI / 2 * i));
            paleta.setStroke(Color.BLACK);
            root.getChildren().add(paleta);
        }
    }

    private void agregarBotonIniciar(Pane root) {
        Button botonIniciar = new Button("Iniciar Simulación");
        botonIniciar.setLayoutX(50);
        botonIniciar.setLayoutY(50);
        root.getChildren().add(botonIniciar);

        botonIniciar.setOnAction(event -> {
            if (!simulacionIniciada) {
                simulacionIniciada = true;
                animarRio();
                rotarTurbina();
                actualizarLED();
            }
        });
    }

    private void animarRio() {
        flujoRio = new TranslateTransition(Duration.seconds(2), rio);
        flujoRio.setFromX(0);
        flujoRio.setToX(-100);
        flujoRio.setCycleCount(TranslateTransition.INDEFINITE);
        flujoRio.setAutoReverse(true);
        flujoRio.play();
    }

    private void rotarTurbina() {
        rotacionTurbina = new RotateTransition(Duration.seconds(1.5), turbina);
        rotacionTurbina.setByAngle(360);
        rotacionTurbina.setCycleCount(RotateTransition.INDEFINITE);
        rotacionTurbina.setInterpolator(javafx.animation.Interpolator.LINEAR);
        rotacionTurbina.play();
    }

    private void actualizarLED() {
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                double energiaGenerada = calcularEnergiaGenerada();

                if (energiaGenerada > 50) {
                    led.setFill(Color.YELLOW);
                } else {
                    led.setFill(Color.DARKGRAY);
                }
            }
        };
        timer.start();
    }

    private double calcularEnergiaGenerada() {
        // Simulación de energía generada (puedes conectar esto a cálculos reales)
        return Math.random() * 100;
    }
}
