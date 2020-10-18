package com.quizapplication
public class Game
{
    Question[] questions=new Question[4];
    Player player=new Player();
    
    String[] questionsdata={"Who is the Prime Minister of India?","Which is the national bird of India?",
    "How many days are in a leap year?",
    "On which day is Christmas celebrated?"};
    
    String[] options1={"Pinarayi Vijayan","Peacock","365","1st January"};
    String[] options2={"Narendra Modi","Pigeon","366","15th April"};
    String[] options3={"Prathiba Patil","Eagle","367","25th December"};
    String[] options={"Sonia Gandhi","Sparrow","368","15th August"};
    int[] answers={2,1,2,3};
    
    public void initGame()
    {
        for(int i=0;i<4;i++){
            questions[i]=new Question();
        }
        
        questions[i].question=questionsdata[i];
        questions[i].option1=options1[i];
        questions[i].option2=options2[i];
        questions[i].option3=options3[i];
        questions[i].option4=options4[i];
        
        questions[i].correctAnswer=answers[i];
        
    }
    
    public void play()
    {
        player.getDetails();
        for(int i=0;i<4;i++)
        {
            boolean status=questions[i].askQuestion();
            if(status==true)
            {
                System.out.println("You Have Played Very Well");
                player.score=player.score+5;
            }
            else{
                System.out.println("Better Luck Next Time");
                player.score=player.score-5;
            }
        }
        System.out.println(player.name+"Your score is: "+player.score);
    }
    
    
}