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

        SpecificItem specificItem11 = new SpecificItem();
        List<Quotes> quotesList11 = new ArrayList<>();
        specificItem11.setTopic("Productivity");
        quotesList11.add(new Quotes("Teach us to make the most of our time, so that we may grow in wisdom. – Ps 90:12"));
        quotesList11.add(new Quotes("So be careful how you live, not as fools but as those who are wise.  Make the most of every opportunity for doing good in these evil days.  Don't act thoughtlessly, but try to understand what the Lord wants you to do.  Don't be drunk with wine, because that will ruin your life.  Instead, let the Holy Spirit fill and control you.  Then you will sing psalms and hymns and spiritual songs among yourselves, making music to the Lord in your hearts.  And you will always give thanks for everything to God the Father in the name of our Lord Jesus Christ. – Eph 5:15-20"));
        quotesList11.add(new Quotes("There is a time for everything, a season for every activity under heaven.  A time to be born and a time to die.  A time to plant and a time to harvest.  A time to kill and a time to heal.  A time to tear down and a time to rebuild.  A time to cry and a time to laugh.  A time to grieve and a time to dance.  A time to scatter stones and a time to gather stones.  A time to embrace and a time to turn away.  A time to search and a time to lose.  A time to keep and a time to throw away.  A time to tear and a time to mend.  A time to be quiet and a time to speak up.  A time to love and a time to hate.  A time for war and a time for peace.  What do people really get for all their hard work?  I have thought about this in connection with the various kinds of work God has given people to do.  God has made everything beautiful for its own time.  He has planted eternity in the human heart, but even so, people cannot see the whole scope of God's work from beginning to end. – Eccles 3:1-11"));
        specificItem11.setQuotes(quotesList11);
        sItems.add(specificItem11);


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


        rvTopics.setLayoutManager(new LinearLayoutManager(this));
        rvTopics.setAdapter(new TopicsAdapter(this, sItems));

    }

    @Override
    public void onBackPressed() {
        Functions.fireIntent(this, false);
    }
}
