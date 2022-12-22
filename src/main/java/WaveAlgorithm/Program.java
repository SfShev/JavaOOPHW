package WaveAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Program {
    public static void main(String[] args) {
        //Печать карты
        var mg = new MapGenerator();
        //Установление координат начальной точки - 1
        Point2D ps = new Point2D(3, 3);
        mg.setStart(ps);
        System.out.println("Пустая карта K - начало маршрута");
        System.out.println(
                new MapPrinter().mapColor(
                        mg.getMap())

        );

        var lee = new WaveAlgorithm(mg.getMap());
        lee.SpreadWave(new Point2D(3, 3));
        System.out.println("Заполненная карта после оцифровки волновым алгоритмом");
        System.out.println(
                new MapPrinter().rawData(
                        mg.getMap())

        );
        //Нанесение на карьу маршрута с начальной точки 1 до конечной 19
        var rd = lee.getRoad(mg.setExit(19));
        lee.drawRoad(rd);
        System.out.println("Заполненная карта с маршрутом");
        System.out.println(
                new MapPrinter().mapColor(
                        mg.getMap()));

    }
}

class WaveAlgorithm {
    int[][] map;

    public WaveAlgorithm(int[][] map) {
        this.map = map;
    }

    // Волновая оцифровка поля от точки старта
    public void SpreadWave(Point2D startPoint) {
        Queue<Point2D> queue = new LinkedList<Point2D>();
        queue.add(startPoint);
        map[startPoint.x][startPoint.y] = 1;

        while (queue.size() != 0) {
            Point2D p = queue.remove();

            if (map[p.x - 1][p.y] == 0) {
                queue.add(new Point2D(p.x - 1, p.y));
                map[p.x - 1][p.y] = map[p.x][p.y] + 1;
            }
            if (map[p.x][p.y - 1] == 0) {
                queue.add(new Point2D(p.x, p.y - 1));
                map[p.x][p.y - 1] = map[p.x][p.y] + 1;
            }
            if (map[p.x + 1][p.y] == 0) {
                queue.add(new Point2D(p.x + 1, p.y));
                map[p.x + 1][p.y] = map[p.x][p.y] + 1;
            }
            if (map[p.x][p.y + 1] == 0) {
                queue.add(new Point2D(p.x, p.y + 1));
                map[p.x][p.y + 1] = map[p.x][p.y] + 1;
            }
        }
    }

    // Формирование массива точек машрута от конечной до начальной точки
    public ArrayList<Point2D> getRoad(Point2D exitPoint) {
        ArrayList<Point2D> road = new ArrayList<>();
        road.add(new Point2D(exitPoint.x, exitPoint.y));
        Point2D p = exitPoint;
        while (map[p.x][p.y] > 1) {

            if (map[p.x - 1][p.y] < map[p.x][p.y] && map[p.x - 1][p.y] > 0) {
                p.x -= 1;
                road.add(new Point2D(p.x, p.y));
            }
            if (map[p.x][p.y - 1] < map[p.x][p.y] && map[p.x][p.y - 1] > 0) {
                p.y -= 1;
                road.add(new Point2D(p.x, p.y));
            }
            if (map[p.x + 1][p.y] < map[p.x][p.y] && map[p.x + 1][p.y] > 0) {
                p.x += 1;
                road.add(new Point2D(p.x, p.y));
            }
            if (map[p.x][p.y + 1] < map[p.x][p.y] && map[p.x][p.y + 1] > 0) {
                p.y += 1;
                road.add(new Point2D(p.x, p.y));
            }
        }
        return road;
    }

    //
    // Расстановка массива точек машрута на карте
    public void drawRoad(ArrayList<Point2D> rd) {
        for (int i = 0; i < rd.size(); i++) {
            map[rd.get(i).x][rd.get(i).y] = 0;
        }
    }
    //
}























    buildscript {
        repositories {
            google()
            mavenCentral()
        }
        dependencies {
            classpath 'com.google.gms:google-services:4.3.13'

        }
    }
    plugins {
        id 'com.android.application' version '7.3.1' apply false
        id 'com.android.library' version '7.3.1' apply false
    }

    allprojects {
        repositories {
            google()
            mavenCentral()

        }
    }













    plugins {
        id 'com.android.application'
        id 'com.google.gms.google-services'
    }

    android {
        namespace 'com.example.sfchat'
        compileSdk 33

        defaultConfig {
            applicationId "com.example.sfchat"
            minSdk 26
            targetSdk 33
            versionCode 1
            versionName "1.0"

            testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
        }

        buildTypes {
            release {
                minifyEnabled false
                proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
            }
        }
        compileOptions {
            sourceCompatibility JavaVersion.VERSION_1_8
            targetCompatibility JavaVersion.VERSION_1_8
        }
        buildFeatures {
            viewBinding true
        }
    }

    dependencies {

        implementation 'androidx.appcompat:appcompat:1.5.1'
        implementation 'com.google.android.material:material:1.7.0'
        implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
        implementation 'androidx.navigation:navigation-fragment:2.5.3'
        implementation 'androidx.navigation:navigation-ui:2.5.3'
        testImplementation 'junit:junit:4.13.2'
        androidTestImplementation 'androidx.test.ext:junit:1.1.4'
        androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.0'
        implementation platform('com.google.firebase:firebase-bom:31.1.1')
        implementation 'com.google.firebase:firebase-analytics'
    }
    apply plugin: 'com.google.gms.google-services'








