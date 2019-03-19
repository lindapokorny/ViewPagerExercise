package com.pursuit.viewpagerexercise.model;

public class Planets {
        private String number;

        private String image;

        private String name;

        public String getNumber ()
        {
            return number;
        }

        public void setNumber (String number)
        {
            this.number = number;
        }

        public String getImage ()
        {
            return image;
        }

        public void setImage (String image)
        {
            this.image = image;
        }

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [number = "+number+", image = "+image+", name = "+name+"]";
        }
    }
