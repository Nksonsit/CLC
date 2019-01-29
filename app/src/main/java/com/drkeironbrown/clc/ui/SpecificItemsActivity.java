package com.drkeironbrown.clc.ui;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.braintreepayments.api.dropin.BaseActivity;
import com.drkeironbrown.clc.R;
import com.drkeironbrown.clc.adapter.TopicsAdapter;
import com.drkeironbrown.clc.custom.TfTextView;
import com.drkeironbrown.clc.db.DBOpenHelper;
import com.drkeironbrown.clc.helper.Functions;
import com.drkeironbrown.clc.model.Quotes;
import com.drkeironbrown.clc.model.SpecificItem;

import java.util.ArrayList;
import java.util.List;

public class SpecificItemsActivity extends BaseActivity {

    private android.widget.ImageView imgBack;
    private com.drkeironbrown.clc.custom.TfTextView txtTitle;
    private android.widget.RelativeLayout toolbar;
    private android.support.v7.widget.RecyclerView rvTopics;
    private List<SpecificItem> sItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specific_items);
        this.rvTopics = (RecyclerView) findViewById(R.id.rvTopics);
        this.toolbar = (RelativeLayout) findViewById(R.id.toolbar);
        this.txtTitle = (TfTextView) findViewById(R.id.txtTitle);
        this.imgBack = (ImageView) findViewById(R.id.imgBack);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        sItems = new ArrayList<>();

        SpecificItem specificItem = new SpecificItem();
        List<Quotes> quotesList = new ArrayList<>();
        quotesList.add(new Quotes(""));
        specificItem.setTopic("Abandonment");
        quotesList.add(new Quotes("The Lord will not abandon His chosen people, for that would dishonor his great name.  He made you a special nation for himself. – 1 Sam 12:22"));
        quotesList.add(new Quotes("For the needy will not be forgotten forever; the hopes of the poor will not always be crushed. – Ps 9:18"));
        quotesList.add(new Quotes("Even if my father and mother abandon me, the Lord will hold me close. – Ps 27:10"));
        quotesList.add(new Quotes("For the Lord hears the cries of his needy ones; He does not despise his people who are oppressed. – Ps 69:33"));
        quotesList.add(new Quotes("God blesses you who are hated and excluded and mocked and cursed because you are identified with me, the Son of Man. – Luke 6:22"));
        quotesList.add(new Quotes("And this is the will of God, that I should not lose even one of all those he has given me, but that I should raise them to eternal life at the last day. – John 6:39"));
        quotesList.add(new Quotes("No, I will not abandon you as orphans – I will come to you. – John 14:18"));
        quotesList.add(new Quotes("We are hunted down, but God never abandons us.  We get knocked down, but we get up again and keep going. – 2 Cor 4:9"));
        quotesList.add(new Quotes("Stay away from the love of money; be satisfied with what you have.  For God has said, 'I will never fail you.  I will never forsake you.' – Heb 13:5"));
        quotesList.add(new Quotes("I know all the things you do.  I have seen your hard work and your patient endurance.  I know you don't tolerate evil people.  You have examined the claims of those who say they are apostles but are not.  You have discovered they are liars. – Rev 2:2"));
        specificItem.setQuotes(quotesList);
        sItems.add(specificItem);


        SpecificItem specificItem1 = new SpecificItem();
        List<Quotes> quotesList1 = new ArrayList<>();
        specificItem1.setTopic("Abundance");
        quotesList1.add(new Quotes("The Lord your God will make you successful in everything you do.  He will give you many children and numerous livestock, and your fields will produce abundant harvests, for the Lord will delight in being good to you as he was to your ancestors. – Deut 30:9"));
        quotesList1.add(new Quotes("'Your crops will be abundant, for I will guard them from insects and disease.  Your grapes will not shrivel before they are ripe,' says the Lord Almighty. – Mal 3:11"));
        quotesList1.add(new Quotes("And God will generously provide all you need.  Then you will always have everything you need and plenty left over to share with others. – 2 Cor 9:8"));
        specificItem1.setQuotes(quotesList1);
        sItems.add(specificItem1);


        SpecificItem specificItem2 = new SpecificItem();
        List<Quotes> quotesList2 = new ArrayList<>();
        specificItem2.setTopic("Addiction");
        quotesList2.add(new Quotes("Do not let sin control the way you live; do not give in to its lustful desires.  Do not let any part of your body become a tool of wickedness, to be used for sinning.  Instead, give yourselves completely to God since you have been given new life.  And use your whole body as a tool to do what is right for the glory of God.  Sin is no longer your master, for you are no longer subject to the law, which enslaves you to sin.  Instead, you are free by God's grace. – Rom 6:12-1)4"));
        quotesList2.add(new Quotes("Those who are dominated by the sinful nature think about sinful things, but those who are controlled by the Holy Spirit think about things that please the Spirit.  If your sinful nature controls your mind, there is death.  But if the Holy Spirit controls your mind, there is life and peace.  For the sinful nature is always hostile to God.  It never did obey God's laws, and it never will.  That's why those who are still under the control of their sinful nature can never please God.  But you are not controlled by your sinful nature.  You are controlled by the Spirit if you have the Spirit of God living in you.  (And remember that those who do not have the Spirit of Christ living in them are not Christians at all.) – Rom 8:5-9"));
        specificItem2.setQuotes(quotesList2);
        sItems.add(specificItem2);


        SpecificItem specificItem3 = new SpecificItem();
        List<Quotes> quotesList3 = new ArrayList<>();
        specificItem3.setTopic("Aging");
        quotesList3.add(new Quotes("Even in old age they will still produce fruit; they will remain vital and green. – Ps 92:14"));
        quotesList3.add(new Quotes("May you live to enjoy your grandchildren.  And may Israel have quietness and peace. – Ps 128:6"));
        quotesList3.add(new Quotes("Wisdom will multiply your days and add years to your life. – Prov 9:11"));
        quotesList3.add(new Quotes("The glory of the young is their strength; the gray hair of experience is the splendor of the old. – Prov 20:29"));
        quotesList3.add(new Quotes("I will be your God throughout your lifetime – until your hair is white with age.  I made you, and I will care for you.  I will carry you along and save you. – Isa 46:4"));
        specificItem3.setQuotes(quotesList3);
        sItems.add(specificItem3);


        SpecificItem specificItem4 = new SpecificItem();
        List<Quotes> quotesList4 = new ArrayList<>();
        specificItem4.setTopic("Anger");
        quotesList4.add(new Quotes("He passed in front of Moses and said, 'I am the Lord, I am the Lord, the merciful and gracious God.  I am slow to anger and rich in unfailing love and faithfulness.  I show this unfailing love to many thousands by forgiving every kind of sin and rebellion.  Even so I do I do not leave sin unpunished, but I punish the children for the sins of their parents to the third and fourth generations.' – Ex 34:6-7"));
        quotesList4.add(new Quotes("Don't sin by letting anger gain control over you. – Ps 4:4"));
        quotesList4.add(new Quotes("God is my shield, saving those whose hearts are true and right.  God is a judge who is perfectly fair.  He is angry with the wicked every day. – Ps 7:10-11"));
        quotesList4.add(new Quotes("The Lord is kind and merciful, slow to get angry, full of unfailing love. – Ps 145:8"));
        quotesList4.add(new Quotes("A gentle answer turns away wrath, but harsh words stir up anger. – Prov 15:1"));
        quotesList4.add(new Quotes("People with good sense restrain their anger, they earn esteem by overlooking wrongs. – Prov 19:11"));
        quotesList4.add(new Quotes("Mockers can get a whole town agitated, but those who are wise will calm anger.– Prov 29:8"));
        quotesList4.add(new Quotes("This suffering is all part of what God has called you to.  Christ, who suffered for you, is your example.  Follow in his steps. – 1 Pet 2:21"));
        quotesList4.add(new Quotes("He did not retaliate when he was insulted.  When he suffered, he did not threaten to get even.  He left his case in the hands of God, who always judges fairly. – 1 Pet 2:23"));
        specificItem4.setQuotes(quotesList4);
        sItems.add(specificItem4);


        SpecificItem specificItem5 = new SpecificItem();
        List<Quotes> quotesList5 = new ArrayList<>();
        specificItem5.setTopic("Assurance");
        quotesList5.add(new Quotes("For the Lord your God is going with you!  He will fight for you against your enemies, and he will give you victory! – Deut 20:4"));
        quotesList5.add(new Quotes("Then I will establish the throne of your dynasty over Israel forever.  For I made this promise to your father, David: 'You will never fail to have a successor on the throne of Israel.' – 1 Kings 9:5"));
        quotesList5.add(new Quotes("But I know you well – your comings and goings and all you do. – 2 Kings 19:27"));
        quotesList5.add(new Quotes("He said, 'Listen King Jehoshaphat!  Listen, all you people of Judah and Jerusalem!  This is what the Lord says: Do not be afraid!  Don't be discouraged by this mighty army, for the battle is not yours, but God's.' – 2 Chron 20:15"));
        quotesList5.add(new Quotes("But the Lord reigns forever, executing judgment from his throne. – Ps 9:7"));
        quotesList5.add(new Quotes("For that is what God is like.  He is our God forever and ever, and he will be our guide until we die. – Ps 48:14"));
        quotesList5.add(new Quotes("You made all the delicate, inner parts of my body and knit me together in my mother's womb.  Thank you for making me so wonderfully complex!  Your workmanship is marvelous – and how well I know it.  You watched me as I was being formed in utter seclusion, as I was woven together in the dark of the womb.  You saw me before I was born.  Every day of my life was recorded in your book.  Every moment was laid out before a single day had passed.  How precious are your thoughts about me, O God!  They are innumerable! – Ps 139:13-17"));
        quotesList5.add(new Quotes("I am holding you by your right hand – I, the Lord your God, And I say to you, 'Do not be afraid.  I am here to help you.' – Isa 41:13"));
        quotesList5.add(new Quotes("But now, O Israel, the Lord who created you says: 'Do not be afraid, for I have ransomed you.  I have called you by name; you are mine.  When you go through deep waters and great trouble, I will be with you.  When you go through rivers of difficulty, you will not drown!  When you walk through the fire of oppression, you will not be burned up; the flames will not consume you.' – Isa 43:1-2"));
        quotesList5.add(new Quotes("The unfailing love of the Lord never ends!  By his mercies we have been kept from complete destruction.  Great is his faithfulness; his mercies begin afresh each day. – Lam 3:22-23"));
        quotesList5.add(new Quotes("However, those the Father has given me will come to me, and I will never reject them. – John 6:37"));
        quotesList5.add(new Quotes("I give them eternal life, and they will never perish.  No one will snatch them away from me, for my Father has given them to me, and he is more powerful than anyone else.  So no one can take them from me.  The father and I are one. – John 10:28-30"));
        quotesList5.add(new Quotes("And we know that God causes everything to work together for the good of those who love God and are called according to his purpose for them. – Rom 8:28"));
        quotesList5.add(new Quotes("Can anything ever separate us from Christ's love?  Does it mean he no longer loves us if we have trouble or calamity, or are persecuted, or are hungry or cold or in danger or threatened with death? – Rom 8:35"));
        quotesList5.add(new Quotes("Because of Christ and our faith in him, we can now come fearlessly into God's presence, assured of his glad welcome. – Eph 3:12"));
        quotesList5.add(new Quotes("That is why we have a great High Priest who has gone to heaven, Jesus the Son of God.  Let us cling to him and never stop trusting him.  This High Priest of ours understands our weaknesses, for he faced all of the same temptations we do, yet he did not sin.  So let us come boldly to the throne of our gracious God.  There we will receive his mercy, and we will find grace to help us when we need it. – Heb 4:14-16"));
        quotesList5.add(new Quotes("But our High Priest offered himself to God as one sacrifice for sins, good for all time.  Then he sat down at the place of highest honor at God's right hand. – Heb 10:12"));
        quotesList5.add(new Quotes("When I saw him, I fell at his feet as dead.  But he laid his right hand on me and said, 'Don't be afraid! I am the First and the Last.  I am the living one who died.  Look, I am alive forever and ever!  And I hold the keys of death and the grave. – Rev 1:17-18"));
        specificItem5.setQuotes(quotesList5);
        sItems.add(specificItem5);


        SpecificItem specificItem6 = new SpecificItem();
        List<Quotes> quotesList6 = new ArrayList<>();
        specificItem6.setTopic("Beginnings");
        quotesList6.add(new Quotes("Great is his faithfulness; his mercies begin afresh each day. – Lam 3:23"));
        quotesList6.add(new Quotes("What this means is that those who become Christians become new persons.  They are not the same anymore, for the old life is gone.  A new life has begun! – 2 Cor 5:17"));
        quotesList6.add(new Quotes("And I am sure that God, who began the good work within you, will continue his work until it is finally finished on that day when Christ Jesus comes back again. – Phil 1:6"));
        specificItem6.setQuotes(quotesList6);
        sItems.add(specificItem6);


        SpecificItem specificItem7 = new SpecificItem();
        List<Quotes> quotesList7 = new ArrayList<>();
        specificItem7.setTopic("Belonging");
        quotesList7.add(new Quotes("The eternal God is your refuge, and his everlasting arms are under you. – Deut 33:27"));
        quotesList7.add(new Quotes("Now go and say to my servant David, 'This is what the Lord Almighty says: I chose you to lead my people Israel when you were just a shepherd boy, tending your sheep out in the pasture.  I have been with you wherever you have gone, and I have destroyed all your enemies.  Now I will make your name famous throughout the earth!  And I have provided a permanent homeland for my people Israel, a secure place where they will never be disturbed.  It will be their own land where wicked nations won't oppress them as they did in the past, from the time I appointed judges to rule my people.  And I will keep you safe from all your enemies.' – 2 Sam 7:8-11"));
        quotesList7.add(new Quotes("Yet we have this assurance: Those who belong to God will live; their bodies will rise again!  Those who sleep in the earth will rise up and sing for joy!  For God's light of life will fall like dew on his people in the place of the dead! – Isa 26:19"));
        quotesList7.add(new Quotes("The Lord gave me a message.  He said, 'I knew you before I formed you in your mother's womb.  Before you were born I set you apart and appointed you as my spokesman to the world.' – Jer 1:4-5"));
        quotesList7.add(new Quotes("I will bring that group through the fire and make them pure, just as gold and silver are refined and purified by fire.  They will call on my name, and I will answer them.  I will say, 'These are my people,' and they will say, 'The Lord is our God.' – Zech 13:9"));
        quotesList7.add(new Quotes("My sheep recognize my voice; I know them and they follow me.  I give them eternal life, and they will never perish.  No one will snatch them away from me, for my Father has given them to me, and he is more powerful than anyone else.  So no one can take them from me.  The Father and I are one. – John 10:27-30"));
        quotesList7.add(new Quotes("Remain in me, and I will remain in you. – John 15:4"));
        specificItem7.setQuotes(quotesList7);
        sItems.add(specificItem7);


        SpecificItem specificItem8 = new SpecificItem();
        List<Quotes> quotesList8 = new ArrayList<>();
        specificItem8.setTopic("Betrayal");
        quotesList8.add(new Quotes("As for this friend of mine, he betrayed me; he broke his promises.  His words are as smooth as cream, but in his heart is war.  His words are as soothing as lotion, but underneath are daggers!  Give your burdens to the Lord, and he will take care of you.  He will not permit the godly to slip and fall. – Ps 55:20-22"));
        specificItem8.setQuotes(quotesList8);
        sItems.add(specificItem8);


        SpecificItem specificItem9 = new SpecificItem();
        List<Quotes> quotesList9 = new ArrayList<>();
        specificItem9.setTopic("Blessings");
        quotesList9.add(new Quotes("The the angel of the Lord called again to Abraham from heaven, 'This is what the Lord says: Because you have obeyed me and have not withheld even your beloved son, I swear by my own self that I will bless you richly.  I will multiply your descendants into countless millions, like the stars of the sky and the sand on the seashore.  They will conquer their enemies, and through your descendants, all the nations of the earth will be blessed – all because you have obeyed me.' – Gen 22:15-18"));
        quotesList9.add(new Quotes("May the Lord bless you and protect you.  May the Lord smile on you and be gracious to you.  May the Lord show you his favor and give you his peace. – Num 6:24-26"));
        quotesList9.add(new Quotes("Like a lion, Israel crouches and lies down; like a lioness, who dares to arouse her?  Blessed is everyone who blesses you, O Israel, and cursed is everyone who curses you. – Num 24:9"));
        quotesList9.add(new Quotes("And now, may it please you to bless me and my family so that our dynasty may continue forever before you.  For when you grant a blessing to your servant, O Sovereign Lord, it is an eternal blessing! – 2 Sam 7:29"));
        specificItem9.setQuotes(quotesList9);
        sItems.add(specificItem9);


        SpecificItem specificItem10 = new SpecificItem();
        List<Quotes> quotesList10 = new ArrayList<>();
        specificItem10.setTopic("Burnout");
        quotesList10.add(new Quotes("The Sovereign Lord, the Holy One of Israel, says, 'Only in returning to me and waiting for me will you be saved.  In quietness and confidence is your strength.' – Isa 30:15"));
        quotesList10.add(new Quotes("Even youths will become exhausted, and young men will give up. – Isa 40:30"));
        quotesList10.add(new Quotes("Then Jesus said, 'Come to me, all of you who are weary and carry heavy burdens, and I will give you rest.  Take my yoke upon you.  Let me teach you, because I am humble and gentle, and you will find rest for your souls.' – Matt 11:28-29"));
        specificItem10.setQuotes(quotesList10);
        sItems.add(specificItem10);


        SpecificItem specificItem12 = new SpecificItem();
        List<Quotes> quotesList12 = new ArrayList<>();
        specificItem12.setTopic("Challenges");
        quotesList12.add(new Quotes("Then David continued, 'Be strong and courageous, and do the work.  Don't be afraid or discouraged by the size of the task, for the Lord God, my God, is with you.  He will not fail you or forsake you.  He will see to it that all the work related to the Temple of the Lord is finished correctly. – 1 Chron 28:20"));
        quotesList12.add(new Quotes("Commit everything you do to the Lord.  Trust him, and he will help you. – Ps 37:5"));
        quotesList12.add(new Quotes("Dear brothers and sisters, whenever trouble comes your way, let it be an opportunity for joy.  For when your faith is tested, your endurance has a chance to grow.  So let it grow, for when your endurance is fully developed, you will be strong in character and ready for anything. – James 1:2-4"));
        specificItem12.setQuotes(quotesList12);
        sItems.add(specificItem12);


        SpecificItem specificItem13 = new SpecificItem();
        List<Quotes> quotesList13 = new ArrayList<>();
        specificItem13.setTopic("Change");
        quotesList13.add(new Quotes("God is our refuge and strength, always ready to help in times of trouble.  So we will not fear, even if earthquakes come and the mountains crumble into the sea. – Ps 46:1-2"));
        specificItem13.setQuotes(quotesList13);
        sItems.add(specificItem13);

        SpecificItem specificItem14 = new SpecificItem();
        List<Quotes> quotesList14 = new ArrayList<>();
        specificItem14.setTopic("Character");
        quotesList14.add(new Quotes("Who may worship in your sanctuary, Lord?  Who may enter your presence on your holy hill?  Those who lead blameless lives and do what is right, speaking the truth from sincere hearts.  Those who refuse to slander others or harm their neighbors or speak ill of their friends.  Those who despise persistent sinners, and honor the faithful followers of the Lord and keep their promises even when it hurts.  Those who do not charge interest on the money they lend, and who refuse to accept bribes to testify against the innocent.  Such people will stand firm forever. – Ps 15:1-5"));
        quotesList14.add(new Quotes("The Lord rewarded me for doing right; he compensated me because of my innocence.  For I have kept the ways of the Lord; I have not turned from my God to follow evil.  For all his laws are constantly before me; I have never abandoned his principles.  I am blameless before God; I have kept myself from sin.  The Lord rewarded me for doing right, because of the innocence of my hands in his sight.  To the faithful you show yourself faithful; to those with integrity you show integrity. – Ps 18:20-25"));
        quotesList14.add(new Quotes("Good people are guided by their honesty; treacherous people are destroyed by their dishonesty.  Riches won’t help on the day of judgment, but right living is a safeguard against death.  The godly are directed by their honesty; the wicked fall beneath their load of sin.- Prov 11:3-5"));
        quotesList14.add(new Quotes("Charm is deceptive, and beauty does not last, but a woman who fears the Lord will be greatly praised. – Prov 31:30"));
        quotesList14.add(new Quotes("And endurance develops strength of character in us, and character strengthens our confident expectation of salvation. – Rom 5:4"));
        quotesList14.add(new Quotes("Be careful how you live among your unbelieving neighbors.  Even if they accuse you of doing wrong, they will see your honorable behavior, and they will believe and give honor to God when he comes to judge the world. – 1 Pet 2:12"));
        specificItem14.setQuotes(quotesList14);
        sItems.add(specificItem14);


        SpecificItem specificItem15 = new SpecificItem();
        List<Quotes> quotesList15 = new ArrayList<>();
        specificItem15.setTopic("Comfort");
        quotesList15.add(new Quotes("But Moses told the people, ‘Don’t be afraid.  Just stand where you are and watch the Lord rescue you.  The Egyptians that you see today will never be seen again.  The Lord himself will fight for you.  You won’t have to lift a finger in your defense!’ – Exod 14:13-14"));
        quotesList15.add(new Quotes("As for God, his way is perfect.  All the Lord’s promises prove true.  He is a shield for all who look to him for protection. – Ps 18:30"));
        quotesList15.add(new Quotes("Even when I walk through the dark valley of death, I will not be afraid, for you are close beside me.  Your rod and your staff protect and comfort me. – Ps 23:4"));
        quotesList15.add(new Quotes("His anger lasts for a moment, but his favor lasts a lifetime!  Weeping may go on all night, but joy comes in the morning. – Ps 30:5"));
        quotesList15.add(new Quotes("The Lord is close to the brokenhearted; he rescues those who are crushed in spirit. – Ps 34:18"));
        quotesList15.add(new Quotes("Remember your promise to me, for it is my only hope.  Your promise revives me; it comforts me in all my troubles. – Ps 119:49-50"));
        quotesList15.add(new Quotes("I meditate on your age-old laws; O Lord, they comfort me. – Ps 119:52"));
        quotesList15.add(new Quotes("The Lord helps the fallen and lifts up those bent beneath their loads. – Ps 145:14"));
        quotesList15.add(new Quotes("He will feed his flock like a shepherd.  He will carry the lambs in his arms, holding them close to his heart.  He will gently lead the mother sheep with their young. – Isa 40:11"));
        quotesList15.add(new Quotes("Don’t be afraid, for I am with you.  Do not be dismayed, for I am your God.  I will strengthen you.  I will help you.  I will uphold you with my victorious right hand. – Isa 41:10"));
        quotesList15.add(new Quotes("Sing for joy, O heavens!  Rejoice, O earth!  Burst into song, O mountains!  For the Lord has comforted his people and will have compassion on them in their sorrow. – Isa 49:13"));
        quotesList15.add(new Quotes("In all their suffering he also suffered, and he personally rescued them.  In his love and mercy he redeemed them.  He lifted them up and carried them through all the years. – Isa 63:9"));
        quotesList15.add(new Quotes("God blesses those who mourn, for they will be comforted. – Matt 5:4"));
        quotesList15.add(new Quotes("What is the price of five sparrows?  A couple of pennies?  Yet God does not forget a single one of them.  And the very hairs on your head are all numbered.  So don’t be afraid; you are more valuable to him than a whole flock of sparrows. – Luke 12:6-7"));
        quotesList15.add(new Quotes("For God so loved the world that he gave his only Son, so that everyone who believes in him will not perish but have eternal life. – John 3:16"));
        quotesList15.add(new Quotes("I have told you all this so that you may have peace in me.  Here on earth you will have many trials ad sorrows.  But take heart, because I have overcome the world. – John 16:33"));
        quotesList15.add(new Quotes("Such things were written in the Scriptures long ago to teach us.  They give us hope and encouragement as we wait patiently for God’s promises. – Rom 15:4"));
        quotesList15.add(new Quotes("All praise to the God and Father of our Lord Jesus Christ.  He is the source of every mercy and the God who comforts us.  He comforts us in all our troubles so that we can comfort others.  When others are troubled, we will be able to give them the same comfort God has given us. – 2 Cor 1:3-4"));
        quotesList15.add(new Quotes("May our Lord Jesus Christ and God our Father, who loved us and in his special favor gave us everlasting comfort and good hope, comfort your hearts and give you strength in every good thing you do and say. – 2 Thess 2:16-17"));
        quotesList15.add(new Quotes("For the Lamb who stands in front of the throne will be their Shepherd.  He will lead them to the springs of life-giving water.  And God will wipe away all their tears. – Rev 7:17"));
        specificItem15.setQuotes(quotesList15);
        sItems.add(specificItem15);


        SpecificItem specificItem16 = new SpecificItem();
        List<Quotes> quotesList16 = new ArrayList<>();
        specificItem16.setTopic("Confidence");
        quotesList16.add(new Quotes("Such people will not be overcome by evil circumstances.  Those who are righteous will be long remembered.  They do not fear bad news; they confidently trust the Lord to care for them.  They are confident and fearless and can face their foes triumphantly. – Ps 112:6-8"));
        quotesList16.add(new Quotes("The Lord keeps watch over you as you come and go, both now and forever. – Ps 121:8"));
        quotesList16.add(new Quotes("Trust in the Lord with all your heart; do not depend on your own understanding.  Seek his will in all you do, and he will direct your paths. – Prov 3:5-6"));
        quotesList16.add(new Quotes("If we are thrown into the blazing furnace, the God whom we serve is able to save us.  He will rescue us from your power, Your Majesty. – Dan 3:17"));
        quotesList16.add(new Quotes("You are the salt of the earth.  But what good is salt if it has lost its flavor?  Can you make it useful again?  It will be thrown out and trampled underfoot as worthless.  You are the light of the world – like a city on a mountain, glowing in the night for all to see.  Don’t hide your light under a basket!  Instead, put it on a stand and let it shine for all.  In the same way, let your good deeds shine out for all to see, so that everyone will praise your heavenly Father. – Matt 5:13-16"));
        quotesList16.add(new Quotes("I have told you all this so that you may have peace in me.  Here on earth you will have many trials ad sorrows.  But take heart, because I have overcome the world. – John 16:33"));
        quotesList16.add(new Quotes("And I am convinced that nothing can ever separate us from is love.  Death can’t, and life can’t.  The angels can’t, and the demons can’t.  Our fears for today, our worries about tomorrow, and even the powers of hell can’t keep God’s love away.  Whether we are high above the sky or in the deepest ocean, nothing in all creation will ever be able to separate us from the love of God that is revealed in Christ Jesus our Lord. – Rom 8:38-39"));
        quotesList16.add(new Quotes("Not that I was ever in need, for I have learned how to get along happily whether I have much or little.  I know how to live on almost nothing or with everything.  I have learned the secret of living in every situation, whether it is with a full stomach or empty, with plenty or little.  For I can do everything with the help of Christ who gives me the strength I need. – Phil 4:11-13"));
        specificItem16.setQuotes(quotesList16);
        sItems.add(specificItem16);

        SpecificItem specificItem17 = new SpecificItem();
        List<Quotes> quotesList17 = new ArrayList<>();
        specificItem17.setTopic("Conflict");
        quotesList17.add(new Quotes("He rescues me and keeps me safe from the battle waged against me, even though many still oppose me. – Ps 55:18"));
        quotesList17.add(new Quotes("If your enemies are hungry, feed them.  If they are thirsty, give them something to drink, and they will be ashamed of what they have done to you.  Don’t let evil get the best of you, but conquer evil by doing good. – Rom 12:20-21"));
        quotesList17.add(new Quotes("Don’t repay evil for evil.  Don’t retaliate when people say unkind things about you.  Instead, pay them back with a blessing.  That is what God wants you to do, and he will bless you for it. For the Scriptures say, ‘If you want a happy life and good days, keep your tongue from speaking evil, and keep your lips from telling lies.  Turn away from evil and do good.  Work hard at living in peace with others.  The eyes of the Lord watch over those who do right, and his ears are open to their prayers.  But the Lord turns his face against those who do evil.’ – 1 Pet 3:9-12"));
        specificItem17.setQuotes(quotesList17);
        sItems.add(specificItem17);

        SpecificItem specificItem18 = new SpecificItem();
        List<Quotes> quotesList18 = new ArrayList<>();
        specificItem18.setTopic("Courage");
        quotesList18.add(new Quotes("I command you – be strong and courageous!  Do not be afraid or discouraged.  For the Lord your God is with you wherever you go. – Josh 1:9"));
        quotesList18.add(new Quotes("But you will not even need to fight.  Take your positions; then stand still and watch the Lord’s victory.  He is with you, O people of Judah and Jerusalem.  Do not be afraid or discouraged.  Go out there tomorrow, for the Lord is with you! – 2 Chron 20:17"));
        quotesList18.add(new Quotes("The Lord is my light and my salvation – so why should I be afraid?  The Lord protects me from danger – so why should I tremble? – Ps 27:1"));
        quotesList18.add(new Quotes("Don’t be afraid, for I am with you.  Do not be dismayed, for I am your God.  I will strengthen you.  I will uphold you with my victorious right hand. – Isa 41:10"));
        quotesList18.add(new Quotes("And when you are brought to trial in the synagogues and before rulers and authorities, don’t worry about what to say in your defense, for the Holy Spirit will teach you what needs to be said even as you are standing there. – Luke 12:11-12"));
        specificItem18.setQuotes(quotesList18);
        sItems.add(specificItem18);

        SpecificItem specificItem19 = new SpecificItem();
        List<Quotes> quotesList19 = new ArrayList<>();
        specificItem19.setTopic("Crisis");
        quotesList19.add(new Quotes("God is our refuge and strength, always ready to help in times of trouble.  So we will not fear, even if earthquakes come and the mountains crumble into the sea.  Let the oceans roar and foam.  Let the mountains tremble as the waters surge! – Ps 46:1-3"));
        quotesList19.add(new Quotes("Trust me in your times of trouble, and I will rescue you, and you will give me glory. – Ps 50:15"));
        quotesList19.add(new Quotes("Since I know it is all for Christ’s good, I am quite content with my weaknesses and with insults, hardships, persecutions, and calamities.  For when I am weak, then I am strong. – 2 Cor 12:10"));
        specificItem19.setQuotes(quotesList19);
        sItems.add(specificItem19);

        SpecificItem specificItem20 = new SpecificItem();
        List<Quotes> quotesList20 = new ArrayList<>();
        specificItem20.setTopic("Decisions");
        quotesList20.add(new Quotes("You will be accepted if you respond in the right way.  But if you refuse to respond correctly, then watch out!  Sin is waiting to attack and destroy you, and you must subdue it. – Gen 4:7"));
        quotesList20.add(new Quotes("But when you ask him, be sure that you really expect him to answer, for a doubtful mind is as unsettled as a wave of the sea that is driven and tossed by the wind.  People like that should not expect to receive anything from the Lord.  They can’t make up their minds.  They waver back and forth in everything they do. – James 1:6-8"));
        specificItem20.setQuotes(quotesList20);
        sItems.add(specificItem20);

        SpecificItem specificItem21 = new SpecificItem();
        List<Quotes> quotesList21 = new ArrayList<>();
        specificItem21.setTopic("Depression");
        quotesList21.add(new Quotes("Go and celebrate with a feast of choice foods and sweet drinks, and share gifts of food with people who have nothing prepared.  This is a sacred day before our Lord.  Don’t be dejected and sad, for the Joy of the Lord is your strength! – Neh 8:10"));
        quotesList21.add(new Quotes("The Lord is close to the brokenhearted; he rescues those who are crushed in spirit. – Ps 34:18"));
        quotesList21.add(new Quotes("Why am I discouraged?  Why so sad?  I will put my hope in God!  I will praise him again – my Savior and my God!  Now I am deeply discouraged, but I will remember your kindness… – Ps 42:5-6"));
        quotesList21.add(new Quotes("He heals the brokenhearted, binding up their wounds. – Ps 147:3"));
        quotesList21.add(new Quotes("Those who listen to instructions will prosper; those who trust the Lord will be happy. – Prov 16:20"));
        quotesList21.add(new Quotes("Even though the fig trees have no blossoms, and there are no grapes on the vine; even though the olive crop fails, and the fields lie empty and barren; even though the flocks die in the fields, and the cattle barns are empty, yet I will rejoice in the Lord!  I will be joyful in the God of my salvation.  The Sovereign Lord is my strength!  He will make me as surefooted as a deer and bring me safely over the mountains. – Hab 3:17-19"));
        quotesList21.add(new Quotes("Each time he said, ‘My gracious favor is all you need.  My power works best in your weakness.’  So now I am glad to boast about my weaknesses, so that the power of Christ may work through me. – 2 Cor 12:9"));
        specificItem21.setQuotes(quotesList21);
        sItems.add(specificItem21);

        SpecificItem specificItem22 = new SpecificItem();
        List<Quotes> quotesList22 = new ArrayList<>();
        specificItem22.setTopic("Discernment");
        quotesList22.add(new Quotes("Give discernment to me, your servant; then I will understand your decrees. – Ps 119:125"));
        quotesList22.add(new Quotes("Happy is the person who finds wisdom and gains understanding. – Prov 3:13"));
        quotesList22.add(new Quotes("My child, don’t lose sight of good planning and insight.  Hang on to them, for they fill you with life and bring you honor and respect.  They keep you safe on your way and keep your feet from stumbling. – Prov 3:21-23"));
        quotesList22.add(new Quotes("If you live a life guided by wisdom, you won’t limp or stumble as you run. – Prov 4:12"));
        quotesList22.add(new Quotes("And God has actually given us his Spirit (not the world’s spirit) so we can know the wonderful things God has freely given us.  When we tell you this, we do not use the words of human wisdom.  We speak words given to us by the Spirit, using the Spirit’s words to explain spiritual truths.  But people who aren’t Christians can’t understand these truths from God’s Spirit.  It all sounds foolish to them because only those who have the Spirit can understand what the Spirit means.  We who have the Spirit understand these things, but others can’t understand us at all.  How could they? For, ‘Who can know what the Lord is thinking?  Who can give him counsel?’ But we can understand these things, for we have the mind of Christ. – 1 Cor 2:12-16"));
        specificItem22.setQuotes(quotesList22);
        sItems.add(specificItem22);

        SpecificItem specificItem23 = new SpecificItem();
        List<Quotes> quotesList23 = new ArrayList<>();
        specificItem23.setTopic("Discipline");
        quotesList23.add(new Quotes("So you should realize that just as a parent disciplines a child, the Lord your God disciplines you to help you. – Deut 8:5"));
        quotesList23.add(new Quotes("No discipline is enjoyable while it is happening – it is painful!  But afterward there will be a quiet harvest of right living for those who are trained in this way. – Heb 12:11"));
        specificItem23.setQuotes(quotesList23);
        sItems.add(specificItem23);

        SpecificItem specificItem24 = new SpecificItem();
        List<Quotes> quotesList24 = new ArrayList<>();
        specificItem24.setTopic("Doubt");
        quotesList24.add(new Quotes("Then the Lord said to Abraham, ‘Why did Sarah laugh?’  Why did she say, ‘Can an old woman like me have a baby?’  Is anything too hard for the Lord?  About a year from now, just as I told you, I will return, and Sarah will have a son. – Gen 18:13-14"));
        quotesList24.add(new Quotes("Then Jesus told them, ‘I assure you, if you have faith and don’t doubt, you can do things like this and much more.  You can even say to this mountain, ‘May God lift you up and throw you into the sea,’ and it will happen.  If you believe, you will receive whatever you ask for in prayer. – Matt 21:21-22"));
        quotesList24.add(new Quotes("He will give you all you need from day to day if you make the Kingdom of God your primary concern.  So don’t be afraid, little flock.  For it gives your Father great happiness to give you the kingdom. – Luke 12:31-32"));
        quotesList24.add(new Quotes("Yet faith comes from listening to this message of good news – the Good News about Christ. – Rom 10:17"));
        specificItem24.setQuotes(quotesList24);
        sItems.add(specificItem24);

        SpecificItem specificItem25 = new SpecificItem();
        List<Quotes> quotesList25 = new ArrayList<>();
        specificItem25.setTopic("Encouragement");
        quotesList25.add(new Quotes("Five of you will chase a hundred, and a hundred of you will chase ten thousand!  All your enemies will fall beneath the blows of your weapons. – Lev 26:8"));
        quotesList25.add(new Quotes("No one will be able to stand their ground against you as long as you live.  For I will be with you as I was with Moses.  I will not fail you or abandon you. – Josh 1:5"));
        quotesList25.add(new Quotes("Each one of you will put to flight a thousand of the enemy, for the Lord your God fights for you, just as he has promised. – Josh 23:10"));
        quotesList25.add(new Quotes("You will have courage because you will have hope.  You will be protected and will rest in safety.  You will lie down unafraid, and many will look to you for help. – Job 11:18-19"));
        quotesList25.add(new Quotes("Then Jesus turned to his disciples and said, ‘God blesses you who are poor, for the Kingdom of God is given to you.  God blesses you who are hungry now, for you will be satisfied.  God blesses you who weep now, for the time will come when you will laugh with joy. – Luke 6:20-21"));
        quotesList25.add(new Quotes("We also pray that you will be strengthened with his glorious power so that you will have all the patience and endurance you need.  May you be filled with joy, always thanking the Father, who has enabled you to share the inheritance that belongs to God’s holy people, who live in the light.  For he has rescued us from the one who rules in the kingdom of darkness, and he has brought us into the Kingdom of his dear Son.  God has purchased our freedom with his blood and has forgiven all our sins. – Col 1:11-14"));
        quotesList25.add(new Quotes("In his kindness God called you to his eternal glory by means of Jesus Christ.  After you have suffered a little while, he will restore, support, and strengthen you, and he will place you on a firm foundation.  All power is his forever and ever.  Amen. – 1 Pet 5:10-11"));
        specificItem25.setQuotes(quotesList25);
        sItems.add(specificItem25);


        SpecificItem specificItem26 = new SpecificItem();
        List<Quotes> quotesList26 = new ArrayList<>();
        specificItem26.setTopic("Endurance");
        quotesList26.add(new Quotes("But those who endure to the end will be saved. – Matt 24:13"));
        quotesList26.add(new Quotes("So don’t get tired of doing what is good.  Don’t get discouraged and give up, for we will reap a harvest of blessing at the appropriate time. – Gal 6:9"));
        quotesList26.add(new Quotes("And I am sure that God, who began the good work within you, will continue his work until it is finally finished on that day when Christ Jesus comes back again. – Phil 1:6"));
        quotesList26.add(new Quotes("Dearest friends, you were always so careful to follow my instructions when I was with you.  And now that I am away you must be even more careful to put into action God’s saving work in your lives, obeying God with deep reverence and fear.  For God is working in you, giving you the desire to obey him and the power to do what pleases him. – Phil 2:12-13"));
        quotesList26.add(new Quotes("For if we are faithful to the end, trusting God just as firmly as when we first believed, we will share in all that belongs to Christ. – Heb 3:14"));
        quotesList26.add(new Quotes("Patient endurance is what you need now, so you will continue to do God’s will.  Then you will receive all that he has promised. – Heb 10:36"));
        quotesList26.add(new Quotes("God blesses the people who patiently endure testing.  Afterward, they will receive he crown of life that God has promised to those who love him. – James 1:12"));
        quotesList26.add(new Quotes("So be truly glad!  There is wonderful joy ahead, even though it is necessary for you to endure many trials for a while.  These trials are only to test your faith, to show that it is strong and pure.  It is being tested as fire tests and purifies gold – and your faith is far more precious to God than mere gold.  So if your faith remains strong after being tried by fiery trials, it will bring you much praise and glory and honor on the day when Jesus Christ is revealed to the whole world. – 1 Pet 1:6-7"));
        quotesList26.add(new Quotes("Of course, you get no credit for being patient if you are beaten for doing wrong.  But if you suffer for doing right and are patient beneath the blows, God is pleased with you. – 1 Pet 2:20"));
        quotesList26.add(new Quotes("Instead, be very glad – because these trials will make you partners with Christ in his suffering, and afterward you will have the wonderful joy of sharing his glory when it is displayed to all the world. – 1 Pet 4:13"));
        quotesList26.add(new Quotes("So make every effort to apply the benefits of these promises to your life.  Then your faith will produce a life of moral excellence.  A life of moral excellence leads to knowing God better.  Knowing God leads to self-control.  Self-control leads to patient endurance, and patient endurance leads to godliness.  Godliness leads to love for other Christians, and finally you will grow to have more genuine love for everyone.  The more you grow like this, the more you will become productive and useful in your knowledge of our Lord Jesus Christ.  But those who fail to develop these virtues are blind or, at least, very shortsighted.  They have already forgotten that God has cleansed them from their old life of sin. – 2 Pet 1:5-9"));
        specificItem26.setQuotes(quotesList26);
        sItems.add(specificItem26);

        SpecificItem specificItem27 = new SpecificItem();
        List<Quotes> quotesList27 = new ArrayList<>();
        specificItem27.setTopic("Faith");
        quotesList27.add(new Quotes("And Abram believed the Lord, and the Lord declared him righteous because of his faith. – Gen 15:6"));
        quotesList27.add(new Quotes("You will keep in perfect peace all who trust in you, whose thoughts are fixed on you! – Isa 26:3"));
        quotesList27.add(new Quotes("Even if you had faith as small as a mustard seed,’ the Lord answered, ‘you could say to this mulberry tree, ‘May God uproot you and throw you into the sea,’ and it would obey you! – Luke 17:6"));
        quotesList27.add(new Quotes("Abraham never wavered in believing God’s promise.  In fact, his faith grew stronger, and in this he brought glory to God.  He was absolutely convinced that God was able to do anything he promised.  And because of Abraham’s faith, God declared him to be righteous. – Rom 4:20-22"));
        quotesList27.add(new Quotes("Hasn’t God chosen the poor in this world to be rich in faith?  Aren’t they the ones who will inherit the Kingdom he promised to those who love him? – James 2:5"));
        specificItem27.setQuotes(quotesList27);
        sItems.add(specificItem27);

        SpecificItem specificItem28 = new SpecificItem();
        List<Quotes> quotesList28 = new ArrayList<>();
        specificItem28.setTopic("Faithfulness");
        quotesList28.add(new Quotes("Understand, therefore, that the Lord your God is indeed God.  He is the faithful God who keeps his covenant for a thousand generations and constantly loves those who love him and obey his commands. – Deut 7:9"));
        quotesList28.add(new Quotes("To the faithful you show yourself faithful; to those with integrity you show integrity. – 2 Sam 22:26"));
        quotesList28.add(new Quotes("So she did as Elijah said, and she and Elijah and her son continued to eat from her supply of flour and oil for many days.  For no matter how much they used, there was always enough left in the containers, just as the Lord had promised through Elijah. – 1 Kings 17:15-16"));
        quotesList28.add(new Quotes("Oh, the joys of those who do not follow the advice of the wicked, or stand around with sinners, or join in with scoffers.  But they delight in doing everything the Lord wants; day and night they think about his law.  They are like trees planted along the riverbank, bearing fruit each season without fail.  Their leaves never wither, and in all they do, they prosper. – Ps 1:1-3"));
        quotesList28.add(new Quotes("But the love of the Lord remains forever with those who fear him.  His salvation extends to the children’s children of those who are faithful to his covenant, of those who obey his commandments! – Ps 103:17-18"));
        quotesList28.add(new Quotes("Never let loyalty and kindness get away from you!  Wear them like a necklace; write them deep within your heart. – Prov 3:3"));
        quotesList28.add(new Quotes("Give thanks to the Lord Almighty, for the Lord is good.  His faithful love endures forever! – Jer 33:11"));
        quotesList28.add(new Quotes("Great is his faithfulness; his mercies begin afresh each day. – Lam 3:23"));
        specificItem28.setQuotes(quotesList28);
        sItems.add(specificItem28);

        SpecificItem specificItem29 = new SpecificItem();
        List<Quotes> quotesList29 = new ArrayList<>();
        specificItem29.setTopic("Fear");
        quotesList29.add(new Quotes("Do not be afraid, Abram, for I will protect you, and your reward will be great. – Gen 15:1"));
        quotesList29.add(new Quotes("The Lord is my light and my salvation – so why should I be afraid?  The Lord protects me from danger – so why should I tremble?  When evil people come to destroy me, when my enemies and foes attack me, they will stumble and fall.  Though a mighty army surrounds me, my heart will know no fear.  Even if they attack me, I remain confident. – Ps 27:1-3"));
        quotesList29.add(new Quotes("So we will not fear, even if earthquakes come and the mountains crumble into the sea. – Ps 46:2"));
        quotesList29.add(new Quotes("Do not be afraid of the terrors of the night, nor fear the dangers of the day, nor dread the plague that stalks in darkness, nor the disaster that strikes at midday.  Though a thousand fall at your side, though ten thousand are dying around you, these evils will not touch you. – Ps 91:5-7"));
        quotesList29.add(new Quotes("Don’t be afraid, for I am with you.  Do not be dismayed, for I am your God.  I will strengthen you.  I will help you.  I will uphold you with my victorious right hand. – Isa 41:10"));
        quotesList29.add(new Quotes("And don’t be afraid of the people, for I will be with you and take care of you.  I, the Lord, have spoken! – Jer 1:8"));
        quotesList29.add(new Quotes("I am leaving you with a gift – peace of mind and heart.  And the peace I give isn’t like the peace the world gives.  So don’t be troubled or afraid. – John 14:27"));
        quotesList29.add(new Quotes("What can we say about such wonderful things as these?  If God is for us, who can ever be against us?  Since God did not spare even his own Son but gave him up for us all, won’t God, who gave us Christ, also give us everything else? – Rom 8:31-32"));
        quotesList29.add(new Quotes("For God has not given us a spirit of fear and timidity, but of power, love, and self-discipline. – 2 Tim 1:7"));
        specificItem29.setQuotes(quotesList29);
        sItems.add(specificItem29);

        SpecificItem specificItem30 = new SpecificItem();
        List<Quotes> quotesList30 = new ArrayList<>();
        specificItem30.setTopic("Forgiveness");
        quotesList30.add(new Quotes("The Lord is slow to anger and rich in unfailing love, forgiving every kind of sin and rebellion.  Even so he does not leave sin unpunished, but he punishes the children for the sins of their parents to the third and fourth generation. – Num 14:18"));
        quotesList30.add(new Quotes("Then if my people who are called by my name will humble themselves and pray and seek my face and turn from their wicked ways, I will hear from heaven and will forgive their sins and heal their lands. – 2 Chron 7:14"));
        quotesList30.add(new Quotes("When I refused to confess my sin, I was weak and miserable, and I groaned all day long.  Day and night your hand of discipline was heavy on me.  My strength evaporated like water in the summer heat.  Finally, I confessed all my sins to you and stopped trying to hide them.  I said to myself, 'I will confess my rebellion to the Lord.' And you forgave me!  All my guilt is gone. – Ps 32:3-5"));
        quotesList30.add(new Quotes("The sacrifice you want is a broken spirit.  A broken and repentant heart, O God, you will not despise. – Ps 51:17"));
        quotesList30.add(new Quotes("O Lord, you are so good, so ready to forgive, so full of unfailing love for all who ask your aid. – Ps 86:5"));
        quotesList30.add(new Quotes("He has not punished us for all our sins, nor does he deal with us as we deserve.  For his unfailing love toward those who fear him is as great as the height of the heavens above the earth.  He has removed our rebellious acts as far away from us as the east is from the west. – Ps 103:10-12"));
        quotesList30.add(new Quotes("No matter how deep the stain of your sins, I can remove it.  I can make you as clean as freshly fallen snow.  Even if you are stained as red as crimson, I can make you as white as wool. – Isa 1:18"));
        quotesList30.add(new Quotes("I – yes, I alone – am the one who blots out your sin for my own sake and will never think of them again. – Isa 43:25"));
        quotesList30.add(new Quotes("Anyone who calls on the name of the Lord will be saved. – Joel 2:32"));
        quotesList30.add(new Quotes("If you forgive those who sin against you, your heavenly Father will forgive you.  But if you refuse to forgive others, your Father will not forgive your sins. – Matt 6:14-15"));
        quotesList30.add(new Quotes("…for this is my blood, which seals the covenant between God and his people.  It is poured out to forgive the sins of many. – Matt 26:28"));
        quotesList30.add(new Quotes("I assure you that any sin can be forgiven, including blasphemy; but anyone who blasphemes against the Holy Spirit will never be forgiven.  It is an eternal sin. – Mark 3:28-29"));
        quotesList30.add(new Quotes("There is forgiveness of sins for all who turn to me. – Luke 24:47"));
        quotesList30.add(new Quotes("For all have sinned; all fall short of God's glorious standard.  Yet now God in his gracious kindness declares us not guilty.  He has done this through Christ Jesus, who has freed us by taking away our sins. – Rom 3:23-24"));
        quotesList30.add(new Quotes("You must make allowances for each other's faults and forgive the person who offends you.  Remember, the Lord forgave you, so you must forgive others. – Col 3:13"));
        quotesList30.add(new Quotes("Finally, all of you should be of one mind, full of sympathy toward each other, loving one another with tender hearts and humble minds.  Don't repay evil for evil.  Don't retaliate when people say unkind things about you.  Instead, pay them back with a blessing.  That is what God wants you to do, and he will bless you for it. – 1 Pet 3:8-9"));
        specificItem30.setQuotes(quotesList30);
        sItems.add(specificItem30);


        SpecificItem specificItem31 = new SpecificItem();
        List<Quotes> quotesList31 = new ArrayList<>();
        specificItem31.setTopic("Guilt");
        quotesList31.add(new Quotes("Purify me from my sins, and I will be clean; wash me, and I will be whiter than snow. – Ps 51:7"));
        quotesList31.add(new Quotes("Everyone who believes in him is freed from all guilt and declared right with God – something the Jewish law could never do. – Acts 13:39"));
        specificItem31.setQuotes(quotesList31);
        sItems.add(specificItem31);

        SpecificItem specificItem32 = new SpecificItem();
        List<Quotes> quotesList32 = new ArrayList<>();
        specificItem32.setTopic("Hope");
        quotesList32.add(new Quotes("When doubts filled my mind, your comfort gave me renewed hope and cheer. – Ps 94:19"));
        quotesList32.add(new Quotes("O Israel, hope in the Lord; for with the Lord there is unfailing love and an overflowing supply of salvation. – Ps 130:7"));
        quotesList32.add(new Quotes("You will keep in perfect peace all who trust in you, whose thoughts are fixed on you! – Isa 26:3"));
        quotesList32.add(new Quotes("The Lord is wonderfully good to those who wait for him and seek him. – Lam 3:25"));
        quotesList32.add(new Quotes("Don't be troubled.  You trust God, now trust in me.  There are many rooms in my Father's home, and I am going to prepare a place for you.  If this were not so, I would tell you plainly.  When everything is ready, I will come and get you, so that you will always be with me where I am. – John 14:1-3"));
        quotesList32.add(new Quotes("So I pray that God, who gives you hope, will keep you happy and full of peace as you believe in him.  May you overflow with hope through the power of the Holy Spirit. – Rom 15:13"));
        quotesList32.add(new Quotes("Now glory be to God!  By his mighty power at work within us, he is able to accomplish infinitely more than we could ever dare to ask or hope. – Eph 3:20"));
        quotesList32.add(new Quotes("Without wavering, let us hold tightly to the hope we say we have, for God can be trusted to keep his promise. – Heb 10:23"));
        quotesList32.add(new Quotes("Through Christ you have come to trust in God.  And because God raised Christ from the dead and gave him great glory, your faith and hope can be placed confidently in God. – 1 Pet 1:21"));
        specificItem32.setQuotes(quotesList32);
        sItems.add(specificItem32);

        SpecificItem specificItem33 = new SpecificItem();
        List<Quotes> quotesList33 = new ArrayList<>();
        specificItem33.setTopic("Humility");
        quotesList33.add(new Quotes("You rescue those who are humble, but your eyes on the proud to humiliate them. – 2 Sam 22:28"));
        quotesList33.add(new Quotes("He leads the humble in what is right, teaching them his way. – Ps 25:9"));
        quotesList33.add(new Quotes("Though the Lord is great, he cares for the humble, but he keeps his distance from the proud. – Ps 138:6"));
        quotesList33.add(new Quotes("For the Lord delights in his people; he crowns the humble with salvation. – Ps 149:4"));
        quotesList33.add(new Quotes("The humble will be filled with fresh joy from the Lord.  Those who are poor will rejoice in the Holy One of Israel. – Isa 29:19"));
        quotesList33.add(new Quotes("The high and lofty one who inhabits eternity, the Holy One, says this: 'I live in that high and holy place with those whose spirits are contrite and humble.  I refresh the humble and give new courage to those with repentant hearts.' – Isa 57:15"));
        quotesList33.add(new Quotes("Therefore, anyone who becomes as humble as this little child is the greatest in the Kingdom of Heaven. – Matt 18:4"));
        quotesList33.add(new Quotes("But those who exalt themselves will be humbled, and those who humble themselves will be exalted. – Matt 23:12"));
        quotesList33.add(new Quotes("…For the proud will be humbled, but the humbled will be honored. – Luke 18:14"));
        quotesList33.add(new Quotes("He gives us more and more strength to stand against such evil desires.  As the Scriptures say, 'God sets himself against the proud, but he shows favor to the humble.  So humble yourselves before God.  Resist the Devil, and he will flee from you.  Draw close to God, and God will draw close to you.  Wash your hands, you sinners, purify your hearts, you hypocrites.  Let there be tears for the wrong things you have done.  Let there be sorrow and deep grief.  Let there be sadness instead of laughter, and gloom instead of joy.  When you bow down before the Lord and admit your dependence on him, he will lift you up and give you honor. – James 4:6-10"));
        quotesList33.add(new Quotes("You younger men, accept the authority of the elders.  And all of you, serve each other in humility for 'God sets himself against the proud, but he shows favor to the humble.  So humble yourselves under the mighty power of God, and in his good time he will honor you. – 1 Pet 5:5-6"));
        specificItem33.setQuotes(quotesList33);
        sItems.add(specificItem33);

        SpecificItem specificItem34 = new SpecificItem();
        List<Quotes> quotesList34 = new ArrayList<>();
        specificItem34.setTopic("Insecurity");
        quotesList34.add(new Quotes("For the Lord your God has arrived to live among you.  He is a mighty savior.  He will rejoice over you with great gladness.  With his love, he will calm all your fears.  He will exult over you by singing a happy song. – Zeph 3:17"));
        quotesList34.add(new Quotes("So you should not be like cowering, fearful slaves.  You should behave instead like God's very own children, adopted into his family – calling him 'Father, dear Father.'  For his Holy Spirit speaks to us deep in our hearts and tells us that we are God's children.  And since we are his children, we will share in his treasures – for everything God gives his Son, Christ, is ours, too.  But if we are to share his glory, we must also share his suffering. – Rom 8:15-17"));
        specificItem34.setQuotes(quotesList34);
        sItems.add(specificItem34);

        SpecificItem specificItem35 = new SpecificItem();
        List<Quotes> quotesList35 = new ArrayList<>();
        specificItem35.setTopic("Integrity");
        quotesList35.add(new Quotes("A man who makes a vow to the Lord or makes a pledge under oath must never break it.  He must do exactly what he said he would do. – Num 30:2"));
        quotesList35.add(new Quotes("Create in me a clean heart, O God.  Renew a right spirit within me.  Do no banish me from your presence, and don't take your Holy Spirit from me.  Restore to me again the joy of your salvation, and make me willing to obey you. – Ps 51:10-12"));
        quotesList35.add(new Quotes("But if you fail to keep your word, then you will have sinned against the Lord, and you may be sure that your sin will find you out. – Num 32:23"));
        quotesList35.add(new Quotes("When you make a vow to the Lord your God, be prompt in doing whatever you promised him.  For the Lord your God demands that you promptly fulfill all your vows.  If you don't, you will be guilty of sin. – Deut 23:21"));
        quotesList35.add(new Quotes("But the leaders replied, 'We have sworn an oath in the presence of the Lord, the God of Israel.  We cannot touch them.  We must let them live, for God would be angry with us if we broke our oath.  Let them live.  But we will make them chop wood and carry the water for the entire community. – Josh 9:19-21"));
        quotesList35.add(new Quotes("To the faithful you show yourself faithful; to those with integrity you show integrity. – 2 Sam 22:26"));
        quotesList35.add(new Quotes("Do any of you want to live a life that is long and good?  Then watch your tongue!  Keep your lips from telling lies! – Ps 34:12-13"));
        quotesList35.add(new Quotes("I will not allow deceivers to serve me, and liars will not be allowed to enter my presence. – Ps 101:7"));
        quotesList35.add(new Quotes("Then you will understand what is right, just, and fair, and you will know how to find the right course of action every time. – Prov 2:9"));
        quotesList35.add(new Quotes("So when you make a promise to God, don't delay in following through, for God takes no pleasure in fools.  Keep all the promises you make to him.  It is better to say nothing than to promise something that you don't follow through on. – Eccles 5:4-5"));
        specificItem35.setQuotes(quotesList35);
        sItems.add(specificItem35);

        SpecificItem specificItem36 = new SpecificItem();
        List<Quotes> quotesList36 = new ArrayList<>();
        specificItem36.setTopic("Justice");
        quotesList36.add(new Quotes("But it is wrong to say God doesn't listen, to say the Almighty isn't concerned.  And it is even more false to say he doesn't see what's going on.  He will bring about justice if you will only wait. – Job 35:13-14"));
        quotesList36.add(new Quotes("Don't say, 'I will get even for this wrong.'  Wait for the Lord to handle the matter. – Prov 20:22"));
        quotesList36.add(new Quotes("God blesses those who are hungry and thirsty for justice, for they will receive it in full. – Matt 5:6"));
        quotesList36.add(new Quotes("Dear friends, never avenge yourselves.  Leave that to God.  For it is written, 'I will take vengeance; I will repay those who deserve it,' says the Lord.' – Rom 12:19"));
        specificItem36.setQuotes(quotesList36);
        sItems.add(specificItem36);

        SpecificItem specificItem37 = new SpecificItem();
        List<Quotes> quotesList37 = new ArrayList<>();
        specificItem37.setTopic("Persistence");
        quotesList37.add(new Quotes("And so I tell you, keep on asking, and you will be given what you ask for.  Keep on looking, and you will find.  Keep on knocking, and the door will be opened.  For everyone who asks, receives.  Everyone who seeks, finds.  And the door is opened to everyone who knocks. – Luke 11:9-10"));
        quotesList37.add(new Quotes("He will give eternal life to those who persist in doing what is good, seeking after the glory and honor and immortality that God offers. – Rom 2:7"));
        specificItem37.setQuotes(quotesList37);
        sItems.add(specificItem37);

        SpecificItem specificItem38 = new SpecificItem();
        List<Quotes> quotesList38 = new ArrayList<>();
        specificItem38.setTopic("Planning");
        quotesList38.add(new Quotes("Wise planning will watch over you.  Understanding will keep you safe. – Prov 2:11"));
        quotesList38.add(new Quotes("You can make many plans, but the Lord's purpose will prevail. – Prov 19:21"));
        quotesList38.add(new Quotes("'For I know the plans I have for you,' says the Lord.  'They are plans for good and not for disaster, to give you a future and a hope. – Jer 29:11"));
        specificItem38.setQuotes(quotesList38);
        sItems.add(specificItem38);

        SpecificItem specificItem39 = new SpecificItem();
        List<Quotes> quotesList39 = new ArrayList<>();
        specificItem39.setTopic("Problems");
        quotesList39.add(new Quotes("The Lord is my light and my salvation – so why should I be afraid?  The Lord protects me from danger – so why should I tremble? – Ps 27:1"));
        quotesList39.add(new Quotes("We are pressed on every side by trouble, but we are not crushed and broken.  We are perplexed, but we don't give up and quit.  We are hunted down, but God never abandons us.  We get knocked down, but we get up again and keep going. – 2 Cor 4:8-9"));
        quotesList39.add(new Quotes("Share each other's troubles and problems, and in this way obey the law of Christ. – Gal 6:2"));
        specificItem39.setQuotes(quotesList39);
        sItems.add(specificItem39);


        SpecificItem specificItem11 = new SpecificItem();
        List<Quotes> quotesList11 = new ArrayList<>();
        specificItem11.setTopic("Productivity");
        quotesList11.add(new Quotes("Teach us to make the most of our time, so that we may grow in wisdom. – Ps 90:12"));
        quotesList11.add(new Quotes("So be careful how you live, not as fools but as those who are wise.  Make the most of every opportunity for doing good in these evil days.  Don't act thoughtlessly, but try to understand what the Lord wants you to do.  Don't be drunk with wine, because that will ruin your life.  Instead, let the Holy Spirit fill and control you.  Then you will sing psalms and hymns and spiritual songs among yourselves, making music to the Lord in your hearts.  And you will always give thanks for everything to God the Father in the name of our Lord Jesus Christ. – Eph 5:15-20"));
        quotesList11.add(new Quotes("There is a time for everything, a season for every activity under heaven.  A time to be born and a time to die.  A time to plant and a time to harvest.  A time to kill and a time to heal.  A time to tear down and a time to rebuild.  A time to cry and a time to laugh.  A time to grieve and a time to dance.  A time to scatter stones and a time to gather stones.  A time to embrace and a time to turn away.  A time to search and a time to lose.  A time to keep and a time to throw away.  A time to tear and a time to mend.  A time to be quiet and a time to speak up.  A time to love and a time to hate.  A time for war and a time for peace.  What do people really get for all their hard work?  I have thought about this in connection with the various kinds of work God has given people to do.  God has made everything beautiful for its own time.  He has planted eternity in the human heart, but even so, people cannot see the whole scope of God's work from beginning to end. – Eccles 3:1-11"));
        specificItem11.setQuotes(quotesList11);
        sItems.add(specificItem11);

        SpecificItem specificItem40 = new SpecificItem();
        List<Quotes> quotesList40 = new ArrayList<>();
        specificItem40.setTopic("Provision");
        quotesList40.add(new Quotes("The Lord is my shepherd; I have everything I need. – Ps 23:1"));
        quotesList40.add(new Quotes("Trust me in your times of trouble, and I will rescue you, and you will give me glory. – Ps 50:15"));
        quotesList40.add(new Quotes("Then turning to his disciples, Jesus said, 'So I tell you, don't worry about everyday life – whether you have enough food and clothing.  Look at the ravens.  They don't need to plant or harvest or put food in barns because God feeds them.  And you are far more valuable to him than any birds!  Can all your worries add a single moment to your life?  Of course not!  And if worry can't do little things like that, what's the use of worrying over bigger things?"));
        quotesList40.add(new Quotes("Look at the lilies and how they grow.  They don't work or make their clothing, yet Solomon on all his glory was not dressed as beautifully as they are.  And if God cares so wonderfully for flowers that are here today and gone tomorrow, won't he more surely care for you?  You have so little faith!  And don't worry about food – what to eat and drink.  Don't worry about whether God will provide it for you.  These things dominate the thoughts of most people, but your Father already knows your needs.  He will give you all you need from day to day if you make the Kingdom of God your primary concern. – Luke 12: 22-31"));
        quotesList40.add(new Quotes("Yes, I am the gate.  Those who come in through me will be saved.  Wherever they go, they will find green pastures.  The thief's purpose is to steal and kill and destroy.  My purpose is to give life in all its fullness. – John 10:9-10"));
        quotesList40.add(new Quotes("But if you stay joined to me and my words remain in you, you may ask any request you like, and it will be granted!  My true disciples produce much fruit.  This brings great glory to my father. – John 15:7-8"));
        quotesList40.add(new Quotes("Since God did not spare even his own Son but gave him up for us all, won't God, who gave us Christ, also give us everything else? – Rom 8:32"));
        quotesList40.add(new Quotes("Now you have every spiritual gift you need as you eagerly wait for the return of our Lord Jesus Christ.  He will keep you strong right up to the end, and he will keep you free from all blame on the great day when our Lord Jesus Christ returns. – 1 Cor 1:7-8"));
        quotesList40.add(new Quotes("And this same God who takes care of me will supply all your needs from his glorious riches, which have been given to us in Christ Jesus. – Phil 4:19"));
        specificItem40.setQuotes(quotesList40);
        sItems.add(specificItem40);

        SpecificItem specificItem41 = new SpecificItem();
        List<Quotes> quotesList41 = new ArrayList<>();
        specificItem41.setTopic("Self-Control");
        quotesList41.add(new Quotes("How can a young person stay pure?  By obeying your word and following its rules. – Ps 119:9"));
        quotesList41.add(new Quotes("But remember that the temptations that come into your life are no different from what others experience.  And God is faithful.  He will keep the temptation from becoming so strong that you can't stand up against it.  When you are tempted, he will show you a way out so that you will not give in to it. – 1 Cor 10:13"));
        quotesList41.add(new Quotes("Knowing God leads to self-control.  Self-control leads to patient endurance, and patient endurance leads to godliness. – 2 Pet 1:6"));
        specificItem41.setQuotes(quotesList41);
        sItems.add(specificItem41);

        SpecificItem specificItem42 = new SpecificItem();
        List<Quotes> quotesList42 = new ArrayList<>();
        specificItem42.setTopic("Success");
        quotesList42.add(new Quotes("The Lord your God will cleanse your heart and the hearts of all your descendants so that you will love him with all your heart and soul, and so you may live!  The Lord your god will inflict all these curses on your enemies and persecutors.  Then you will again obey the Lord and keep all the commands I am giving you today.  The Lord your God will make you successful in everything you do.  He will give you many children and numerous livestock, and your fields will produce abundant harvests, for the Lord will delight in being good to you as he as was to your ancestors. – Deut 30:6-9"));
        quotesList42.add(new Quotes("They did not conquer the land with their swords; it was not their own strength that gave them victory.  It was by your mighty power that they succeeded; it was because you favored them and smiled on them.  You are my King and my God.  You command victories for your people.  Only by your power can we push back our enemies; only in your name can we trample our foes.  I do not trust my bow; I do not count on my sword to save me.  It is you who gives us victory over our enemies; it is you who humbles those who hate us.  O God, we give glory to you all day long and constantly praise your name. – Ps 44:3-8"));
        quotesList42.add(new Quotes("Praise the Lord!  Happy are those who fear the Lord.  Yes, happy are those who delight in doing what he commands.  Their children will be successful everywhere; an entire generation of godly people will be blessed.  They themselves will be wealthy, and their good deeds will never be forgotten.  When darkness overtakes the godly, light will come bursting in.  They are generous, compassionate, and righteous. – Ps 112:1-4"));
        quotesList42.add(new Quotes("Plans go wrong for lack of advice; many counselors bring success. – Prov 15:22"));
        quotesList42.add(new Quotes("Commit your work to the Lord, and then your plans will succeed. – Prov 16:3"));
        quotesList42.add(new Quotes("We can gather our thoughts, but the Lord gives the right answer.  People may be pure in their own eyes, but the Lord examines their motives. – Prov 16:1-2"));
        quotesList42.add(new Quotes("The horses are prepared for battle, but the victory belongs to the Lord. – Prov 21:31"));
        quotesList42.add(new Quotes("Good planning and hard work lead to prosperity, but hasty shortcuts lead to poverty. – Prov 21:5"));
        quotesList42.add(new Quotes("We are confident of all this because of our great trust in God through Christ.  It is not that we think we can do anything of lasting value by ourselves.  Our only power and success come from God. – 2 Cor 3:4-5"));
        quotesList42.add(new Quotes("As for me and my family, we will serve the Lord. – Josh 24:15"));
        specificItem42.setQuotes(quotesList42);
        sItems.add(specificItem42);

        rvTopics.setLayoutManager(new LinearLayoutManager(this));
        rvTopics.setAdapter(new TopicsAdapter(this, sItems));

    }

    @Override
    public void onBackPressed() {
        Functions.fireIntent(this, false);
    }
}
