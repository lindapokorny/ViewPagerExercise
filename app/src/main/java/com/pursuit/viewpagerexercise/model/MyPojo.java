package com.pursuit.viewpagerexercise.model;

public class MyPojo {

        private Planets[] planets;

        public Planets[] getPlanets ()
        {
            return planets;
        }

        public void setPlanets (Planets[] planets)
        {
            this.planets = planets;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [planets = "+planets+"]";
        }
    }

