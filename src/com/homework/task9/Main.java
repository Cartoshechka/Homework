package com.homework.task9;


public class Main {


        public static void main( String[] args )
        {

            Human humanGrandpa = new Human( "Petya" );
            Human humanGranny = new Human( "Lyuda" );
            Human humanFather = new Human( "Andrey", null, humanGrandpa);
            Human humanMother = new Human( "Nastya", humanGranny, null );
            Human humanSon = new Human( "Nikita", humanMother, humanFather);


            System.out.println(humanGrandpa);
            System.out.println(humanGranny);
            System.out.println(humanFather);
            System.out.println(humanMother);
            System.out.println(humanSon);
        }

        public static class Human
        {
            private String name;
            private Human father;
            private Human mother;

            Human(String name )
            {
                this.name = name;
            }

            Human(String name, Human mother, Human father )
            {
                this.name = name;
                this.mother = mother;
                this.father = father;
            }

            @Override
            public String toString()
            {
                if ( ( mother == null ) && ( father == null ) )
                {
                    return "Grandparent name is " + name + ", no mother, no father";
                }
                else if ( ( mother == null ) && ( father != null ) )
                {
                    return "Father name is " + name + ", no mother, father is " + father.name;
                }
                else if ( ( mother != null ) && ( father == null ) )
                {
                    return "Mother name is " + name + ", mother is " + mother.name + ", no father";
                }
                else
                {
                    return "Child name is " + name + ", mother is " + mother.name + ", father is " + father.name;
                }
            }
        }
    }

