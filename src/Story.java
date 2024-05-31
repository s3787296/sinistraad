/**
 * Story class contains all story methods returned from LocationList and
 * Encounters classes.
 * 
 * @author Amelia
 * @author Jude
 * @author Max
 * @version 1.0
 */
public class Story {

   /**
    * e5Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location E5
    */
   public static String e5Story() {
      return String.join("\n", "You stand in the barren town square of your village.",
            "It's no longer the same joy-filled place where you and your closest friends grew up, surrounded by family who loved you.",
            "His reign of terror over the land ends with you, as you set out on your journey to Castle Sinistraad to finally slay whatever evil lurks inside.");
   }

   /**
    * e4Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location E4
    */
   public static String e4Story() {
      return String.join("\n",
            "Trudging through the tall grass of the field, you see the entrance to the Duskwood Forest, beyond which lies the grounds of Castle Sinistraad.",
            "As you head towards the mouth of the forest you are hailed by Old Remraf, the eccentric farmer who owns the lands surrounding the town.",
            "To the west is the forest lining, the Old Town is back down south, and to the north is the Twisted Caverns.");
   }

   /**
    * farmerStory method is called from the Encounters.farmerEncounter method.
    * 
    * @return Generic farmer story text
    */
   public static String farmerStory() {
      return String.join("\n",
            "OLD REMRAF: Child! I heard word of your plan to journey onward and finally slay that evil spirit cursing our land, but I fear you are not yet ready for such a journey!",
            "You will need a map to find your way through the forest to the castle! I happen to have one, but to get it you'll have to prove yourself!",
            "Say... What if you go to the Twisted Caverns up north, and slay the Arachnid Matriarch? That will prove that you're ready for such an adventure!",
            "Oh, before you go - I've got an old sword laying around which you're welcome to have - you won't be able to fight the Arachnid Matriarch without one!");
   }

   /**
    * farmerStory method is called from the Encounters.farmerEncounter method.
    * 
    * @return text when player returns to the farmer
    */
   public static String farmerReturnStory() {
      return String.join("\n",
            "OLD REMRAF: Ahoy, child! I can see by your bloody blade that you have defeated that nasty creature that's been killing our beautiful cows and webbing up the crops!",
            "You've done the town a great service, and I can see that you truly are ready to conquer the forest and slay that evil Count!",
            "I'm giving you this map so that you may not get lost in the Duskwood Forest.",
            "Take this map so that you may not get lost in the Duskwood Forest. Be careful - I've seen many a traveller enter, but none return...");
   }

   /**
    * e3Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location E3
    */
   public static String e3Story() {
      return String.join("\n",
            "You stand at the cave entrance, the scuttling of hundreds of many-legged creatures emanating from within.",
            "You never did like spiders.");
   }

   /**
    * beforeArachnidStory method is called from the EnemyList.arachnidMatriarch
    * method.
    * 
    * @return text prior to the Arachnid Matriarch battle
    */
   public static String beforeArachnidStory() {
      return String.join("\n",
            "You hesitantly inch through the Twisted Caverns, feeling spiderwebs catch against your head. The crunches and squelches of tiny spiders scurry and squish under your heavy footfalls - there are too many to avoid.",
            "After a while, you find yourself standing in front of the largest web you've seen in your life - it's bigger than you are.",
            "You pick up a rock and toss it at the web, watching as it ripples from the impact. You hear a clicking sound from above...",
            "Hesitantly looking up, you freeze in horror as eight enormous, glowing eyes pierce down through the darkness, landing on you as the source of the commotion.",
            "The Arachnid Matriarch's monstrous form scuttles her way down the man-sized web to meet you where you stand.");
   }

   /**
    * afterArachnidStory method is called from the EnemyList.arachnidMatriarch
    * method.
    * 
    * @return text after the Arachnid Matriarch battle
    */
   public static String afterArachnidStory() {
      return String.join("\n",
            "At last, the Arachnid Matriarch lays defeated before you, oozing a sticky blue fluid from the many wounds you inflicted. You now understand the weight of the journey that lies ahead.",
            "You must now return to Old Remraf, and get his blessings for the journey ahead. The map he mentioned wouldn't hurt to have either.");
   }

   /**
    * d4Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location D4
    */
   public static String d4Story() {
      return String.join("\n",
            "You're just outside the safety of the town's outer borders, stepping hesitantly through the forest lining, the sunlight blotted out by the dense canopy above you.",
            "The air surrounding you is heavy with damp and a sense of impending doom.",
            "The only direction that doesn’t seem to lead to more forest is east, back into the safety of the field, but you have a job to do.");
   }

   /**
    * d5Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location d5
    */
   public static String d5Story() {
      return String.join("\n", "You wander along an overgrown path - not many people have been out this way recently.",
            "As you continue, the shrubbery either side of the path becomes even more gnarled and poorly maintained.",
            "You are forced to inch along sideways as the tangle of plants older than yourself eventually stop you from continuing any further.",
            "You must turn around and find more travelled paths.");
   }

   /**
    * d3Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location D3
    */
   public static String d3Story() {
      return String.join("\n",
            "You continue further into the forest. To the north you can see the forest start to thin out, beyond which lies a sandy shore.",
            "To the west lies more forest.", "To the south also lies more forest.");
   }

   /**
    * d2Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location D2
    */
   public static String d2Story() {
      return String.join("\n",
            "Breaching into a clearing, the shore gives way to an enormous, quiet lake. It is unnaturally quiet - there is no birdsong or the chirp of insects.",
            "The clear blue water glimmers, enticing you to take a dip, but your driven nature and fear of the unknown outweighs the almost gravitational pull of the blue depths. ");
   }

   /**
    * beforeMaidenStory method is called from the EnemyList.lostMaiden method.
    * 
    * @return text prior to the Lost Maiden battle
    */
   public static String beforeMaidenStory() {
      return String.join("\n",
            "You scan the shore of the lake and - what's that?\nIt looks like a body?\nSurely not... You take another look and to your disgust, your analysis was sound.",
            "The waterlogged corpse is splayed out on the shoreline, reaching towards the forest.",
            "As you approach the bloated corpse, it suddenly stirs to life, its waterlogged torso rising on distended bruised limbs, and hollow grey eyes stare menacingly at you.",
            "They were once filled with life, but no more.",
            "You could probably outrun it, or you can face it - if you dare.");
   }

   /**
    * afterMaidenStory method is called from the EnemyList.lostMaiden method.
    * 
    * @return text after the Lost Maiden battle
    */
   public static String afterMaidenStory() {
      return String.join("\n",
            "After a long battle, you fall to your knees, exhausted. As the sliced corpse lays before you, a ghostly spirit rises from it, moping back to the lake's waterline.",
            "It - no, she - slumps down, and you watch as she begins to sob. The glowing tears pour down her face through her hands and into the lake.");
   }

   /**
    * tearsFailStory method is called from the Encounters.maidenTearsEncounter
    * method.
    * 
    * @return text if the player can't collect the Maiden's Tears
    */
   public static String tearsFailStory() {
      return String.join("\n",
            "As the tears continue to flow and glimmer as they fall into the lake, you wish you could take some with you.");
   }

   /**
    * tearsSucceedStory method is called from the Encounters.maidenTearsEncounter
    * method.
    * 
    * @return text if the player successfully collects the Maiden's tears
    */
   public static String tearsSucceedStory() {
      return String.join("\n",
            "You hesitantly reach the ornate goblet out into the transparent form of the Lost Maiden, intercepting her steady flow of mystical tears, filling the goblet to the brim.");
   }

   /**
    * c3Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location C3
    */
   public static String c3Story() {
      return String.join("\n",
            "You continue travelling through the Duskwood Forest, the broken path threatening to trip you up at every step.",
            "To the north, you notice another clearing - it intrigues you.",
            "You could also turn east and go even deeper into the forest.");
   }

   /**
    * c2Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location C2
    */
   public static String c2Story() {
      return String.join("\n",
            "As you emerge from the darkness of the forest, you feel the warmth of the sun on your skin and look around the clearing.",
            "It's a dead end, but it's still full of life - a wrinkled figure draped in all manner of fabrics wanders around the clearing, humming to themself.",
            "They glance over at you through their goggles, excitement gleaming in their bug-like eyes.",
            "You have no clue how long they've been posted at this spot, but you feel like they could probably use a chat.");
   }

   /**
    * nostramusStartStory method is called from the Encounters.apothecaryEncounter
    * method.
    * 
    * @return text at the beginning of the interaction with the NPC Nostramus in
    *         the Apothecary
    */
   public static String nostramusStartStory() {
      return String.join("\n",
            "As you step closer, he smiles at you, and it seems genuine. You feel like you're meeting an old friend.",
            "They open their cloak open to reveal various potions and a golden goblet inscribed with mesmerising patterns.");
   }

   /**
    * nostramusGobletStory method is called from the Encounters.apothecaryEncounter
    * method.
    * 
    * @return text in interaction with the NPC Nostramus in the Apothecary when
    *         player receives the empty goblet item
    */
   public static String nostramusGobletStory() {
      return String.join("\n", "After handing your money over, Nostramus hands you the goblet.",
            "The goblet feels dense and almost commands attention when in view. You quickly stuff it into your bag, you could use it to hold any liquid you might need.");
   }

   /**
    * c4Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location c4
    */
   public static String c4Story() {
      return String.join("\n",
            "As you spend longer and longer in the forest, you begin to wonder what time it is. How long have you been walking?",
            "You feel like you may be making little progress or might just be walking in circles.",
            "Continue heading west to descend deeper into the forest, or head east and succumb to your weak constitution and retreat from the forest.");
   }

   /**
    * b4Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location B4
    */
   public static String b4Story() {
      return String.join("\n",
            "The forest is mocking you, you feel the judgement of the trees and creatures native to these dark lands weighing on you.",
            "As you feel the paranoia of walking in the same direction for who knows how long, being endlessly harassed by the monsters of the forest, you notice the path split around a tree ahead of you.",
            "You hear faint howling to the south, louder than the usual wolves of the forest, must be the direction of their den.",
            "Or you could head west and head in the direction of the castle entrance.");
   }

   /**
    * b5Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location B5
    */
   public static String b5Story() {
      return String.join("\n",
            "The guttural howls of wolves ahead grow louder and louder, is the forest just playing tricks or are they sounding more and more human?",
            "You see the maw of a cave in the distance to the east, and the trees here have large claw marks like a cats scratching pole. You try to ignore the bones.",
            "You can go north to head away from the den and back to the main path, if you'd like.");
   }

   /**
    * c5Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location C5
    */
   public static String c5Story() {
      return String.join("\n",
            "You decide to step into the cave, as soon as you do you see that there are the shadowed forms of werewolves, plucking at the corpse of some forest creature, stripping flesh from bone with ease.",
            "You could probably get a sneak attack in if you really needed to fall these beasts, or escape the way you came.");
   }

   /**
    * beforeWerewolvesStory method is called from the EnemyList.alphaDuskwolf
    * method.
    * 
    * @return text prior to the Alpha Duskwolf battle
    */
   public static String beforeWerewolvesStory() {
      return String.join("\n",
            "As you step closer to the werewolves turned backs, the rib of a small creature cracks loudly under your foot. You cringe at the sound, and at the predicament you've ended up in..",
            "The cave full of werewolves immediately stop what they were focusing on, turning towards their new target. The wolf who seems to be the Alpha steps forward, growling at you.");
   }

   /**
    * afterWerewolvesStory method is called from the EnemyList.alphaDuskwolf
    * method.
    * 
    * @return text after the Alpha Duskwolf battle
    */
   public static String afterWerewolvesStory() {
      return String.join("\n",
            "As your sword plunges into the Alpha Werewolf's neck and the life fades from its wild eyes, you stand covered in blood, panting to catch your breath.",
            "You can't believe you won. You realise that the werewolf's tough hide might be perfect as armour, despite being gross.",
            "You carefully peel the hide off the werewolf's body. It looks so much more human without the fur, but you don't want to think about that.",
            "After scraping the fat from the skin, you trim and loosely stitch the hide into a chest piece. This'll do.");
   }

   /**
    * a4Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location A4
    */
   public static String a4Story() {
      return String.join("\n",
            "Before you realise, you're facing the entrance to the castle courtyard, a neat dirt path lined by tombstones crowded together, each significantly older than the last.",
            "Perched upon the entrance of the Castle sits a gargoyle statue, unmoving. You see a large, rusty key fastened to a collar on the statue's neck.",
            "It looks like the key to the castle door will be a little more difficult to acquire.");
   }

   /**
    * a3Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location A3
    */
   public static String a3Story() {
      return String.join("\n",
            "The door opens with a resounding THUNK. You look onward, your eyes dancing around the inside of the castle as the tingle of anticipation walks your spine."+
           "\n"+"the pristine interior of the building starkly contrasting against the aged decaying exterior of the castle as the well lit torch sconces dance with light ");
   }

   /**
    * beforeGatekeeperSyek method is called from the EnemyList.gatekeeperSyek
    * method.
    * 
    * @return text prior to the Gatekeeper Syek battle
    */
   public static String beforeGatekeeperSyek() {
      return String.join("\n",
            "You slip your boots between the cracks in the large granite bricks at the castle's entrance, steadily scaling the castle exterior to reach the key.",
            "As you're busy trying to pry the key off the statue's neck, hanging onto the ledge for balance, a loud yell startles you and causes you to lose your balance.",
            "You fall to the ground, the wind knocked from your chest.",
            "GATEKEEPER SYEK: Oi! That ain't the real key, you know? That's a decoy, and it's done its job. Now it's time for me to do mine - strangers aren't allowed in the castle.",
            "The gatekeeper draws his blade from its sheath, turning it towards you. You scramble to your feet as you prepare to defend yourself.");
   }

   /**
    * afterGatekeeperSyek method is called from the EnemyList.gatekeeperSyek
    * method.
    * 
    * @return text after the Gatekeeper Syek battle
    */
   public static String afterGatekeeperSyek() {
      return String.join("\n",
            "The gatekeeper falls to the floor, exhausted. His makeshift armour is falling apart from the cuts your sword has made, and his body is covered in his own sweat, blood, and tears.",
            "GATEKEEPER SYEK: I beg of you, please don't kill me. I'll give you the key - please, just let me leave with my life.",
            "You decide to show him mercy - there's no reason to kill for pleasure, after all.",
            "You take the key from the man and walk to the gate. You slide the key into the lock and turn it.",
            "With a loud clunk, the key turns the old mechanism in the door, and the door grinds against the floor as it pushes open.");
   }

   /**
    * a2Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location A2
    */
   public static String a2Story() {
      return String.join("\n",
            "The inside of the castle is pristine, the floors swept and the candle holders stocked and lit. It's particularly warm for inside a castle.",
            "The intricate pattern of the marble floor winds deeper into the castle.");
   }

   /**
    * b2Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location B2
    */
   public static String b2Story() {
      return String.join("\n", "As you walk through the castle landing, you feel the eyes of paintings track you.",
            "It was common knowledge that some powerful, ancient family had occupied this castle for longer than your town was around.",
            "The pristine marble floors cause your boots to click clack as you hesitantly enter deeper, guaranteed to attract unwanted attention.");
   }

   /**
    * b3Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location B3
    */
   public static String b3Story() {
      return String.join("\n",
            "You creak the door open to a small basement, that is filled with cobwebs and clearly not maintained.",
            "The smell of rotten fruit hits your nose and cause you to wince as you see the thick syrup of old wine casks leak over the floor, spilling spoiled and forgotten wine making the floor sticky and red.",
            "The room seems to have been abandoned, why would the Count not want wine? There appears to be nothing of interest in this neglected part of the castle.");
   }

   /**
    * b1Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location B1
    */
   public static String b1Story() {
      return String.join("\n",
            "Stepping further into the castle, you reach the end of a hallway, to the east is a large door with golden and bejewelled handles.",
            "It's locked. You need a key that will fit in this keyhole.", "To the west, you feel a sweltering heat.");
   }

   /**
    * a1Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location A1
    */
   public static String a1Story() {
      return String.join("\n",
            "You push open the door, only to be met with a blast of sweltering heat, and an enclosed forge room with a stockpile of coal, hardwood, and various metals and ores filling the corners.",
            "A grizzled old man with leathery, ashen skin hammers at a red-hot sword methodically, humming quietly.",
            "A golden key matching the aesthetics of the door dangles from a keyring on his apron.");
   }

   /**
    * beforeFuegoStory method is called from the EnemyList.forgemasterFuego method.
    * 
    * @return text prior to the Forgemaster Fuego battle
    */
   public static String beforeFuegoStory() {
      return String.join("\n",
            "You step around the dimly lit corners of the forge room, hoping not to draw attention as you attempt to step behind the smith to steal the key.",
            "He glances up at the open door, eyes darting around the room to land on you, the intruder.",
            "Forgemaster Fuego: Hey, wh- You aren't supposed to be here! he shouts before raising the red hot sword to your face.");
   }

   /**
    * afterFuegoStory method is called from the EnemyList.forgemasterFuego method.
    * 
    * @return text after the Forgemaster Fuego battle
    */
   public static String afterFuegoStory() {
      return String.join("\n",
            "You manage to get the upper hand and plunge your sword through the chest of the Forgemaster, his last strained breath seeps out of his body as he falls back into the pile of coals.",
            "You pluck the key off his person and stash it on you. The silver patterns on the sword glow, as the red-hot blade smolders on the floor.",
            "Hesitantly, you pick up the sword - the handle is surprisingly cool to the touch while the blade radiates intense heat.",
            "You find a similar looking scabbard on the ground and find it perfectly blocks the heat while covering the blade.",
            "The sword feels perfectly balanced, and it's not too heavy either. What an upgrade.");
   }

   /**
    * c1Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location C1
    */
   public static String c1Story() {
      return String.join("\n",
            "You slip the golden key into the slot, and hear the intricate mechanism in the gilded door whirr, then click.",
            "You push the door open with ease, entering the next segment of the castle.",
            "You realise that you entered some kind of prayer room, with an altar across from two small rows of pews, all built out of expensive materials.",
            "The pedestal almost glows on its own, the intricate patterns warping the light of the candles in the room.");
   }

   /**
    * altarSuccessStory method is called from the Encounters.altarEncounter method.
    * 
    * @return text if the player successfully blesses the filled goblet at the
    *         altar
    */
   public static String altarSuccessStory() {
      return String.join("\n", "Walking up to the altar, you're reminded of the patterns on the goblet you bought.",
            "You reach into your bag and extract the matching goblet, brimming with the tears from the ghost of the Lost Maiden.",
            "Gently placing the goblet into a lowered groove on the altar, it fits with a satisfying clunk, before exploding in a flourish of multicolored light.",
            "The tears almost boil off, leaving behind a couple drops of a potent elixir in the goblet. Holy water. You retrieve the goblet and stash it in your bag.");
   }

   /**
    * altarFailStory method is called from the Encounters.altarEncounter method.
    * 
    * @return text if the player is unable to bless the filled goblet at the altar
    */
   public static String altarFailStory() {
      return String.join("\n", "Crossing the room, you notice a circular groove in the surface of the altar.",
            "You spend a few moments tracing the groove and the intricate patterns with your fingers, pressing and pushing.",
            "It seems like you need an item to use the altar correctly.");
   }

   /**
    * d1Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location D1
    */
   public static String d1Story() {
      return String.join("\n",
            "You continue deeper into the castle. The air is thick with candle soot and the empty halls beckon you to the end of the hall. A humble wooden door lies before you.");
   }

   /**
    * e1Story method is displayed when the Direction.travel method is called.
    * <p>
    * This method is called from the LocationList.createLocations method.
    * 
    * @return Story text for location E1
    */
   public static String e1Story() {
      return String.join("\n",
            "You slam the door open, sword brandished in front of you. Somehow, this isn't the sight you expected to see.",
            "A tall, thin man with translucent skin and gaunt eyes lounges in an open casket. He is dressed in an expensive black suit and a cape, matching the colours (or lack thereof) around him.");
   }

   /**
    * beforeEripmavStory method is called from the EnemyList.countEripmav method.
    * 
    * @return text prior to the Count Eripmav battle
    */
   public static String beforeEripmavStory() {
      return String.join("\n",
            "The man raises his eyes to meet your gaze, his cat-like eyes piercing your soul. He grins, mouth contorting to reveal long, sharp fangs.",
            "\nCOUNT ERIPMAV: Finally! Another creature has come to meet their demise. I could use another feed...\n",
            "The Count scoffs as he rises to his feet, smoothing his hands over his suit.",
            "You finally have your chance to defeat him. Better not blow it.");
   }

   /**
    * goodEndingStory method is called from the Encounters.eripmavEncounter method.
    * 
    * @return text after the player wins the Count Eripmav battle and doesn't have
    *         the blessed goblet
    */
   public static String goodEndingStory() {
      return String.join("\n",
            "The clashing of claws and teeth on metal finally ends as you deliver the killing blow, striking the Count across the chest.",
            "He falls to the ground pathetically.",
            "\nCOUNT ERIPMAV: You really are stronger than I remember humans to be, I must remember that.\n",
            "As the Count begins to disintegrate into a cloud of smoke, you desperately swing your sword, its blade slicing through rapidly dissipating cloud of smoke.",
            "You defeated the Count Eripmav, but you have a funny feeling this might not be the last you see of him.");
   }

   /**
    * greatEndingStory method is called from the Encounters.eripmavEncounter
    * method.
    * 
    * @return text after the player wins the Count Eripmav battle and does have the
    *         blessed goblet
    */
   public static String greatEndingStory() {
      return String.join("\n",
            "The clashing of claws and teeth on metal finally ends as you deliver the killing blow, as you strike the count across the chest he falls to the ground pathetically.",
            "The count hisses, turning into a cloud of smoke. The goblet of holy water in your pocket almost sings to you, and you quickly pull out the goblet and flick it towards the cloud of smoke.",
            "The droplets of holy water force the Count out of his smoke form and he slumps to the ground screeching and writhing.",
            "The spots of holy water you continue to flick on him burning holes through his clothes and skin.",
            "\nCOUNT ERIPMAV: NO, THIS CAN'T BE! I WAS NEVER SUPPOSED TO DIE - AGAIN!\n",
            "You tip the goblet upside down over his melting body, the last drop of holy water falls on his head and the body of the Count turns to ash on the ground.",
            "Dead. You did it! You finally beat the count for good!");
   }

   /**
    * badEndingStory method is called from the Game.playerDied method.
    * 
    * @return text if the player dies during the Count Eripmav battle
    */
   public static String badEndingStory() {
      return String.join("\n",
            "You swing wildly at the Count, trying your very best, but one wrong step has his claws slash at your chest, spilling too much blood for a human to survive.",
            "Despite all your efforts, you lost. You collapse face down on the floor of the counts room as he laughs coldly, leaning down to taste your blood, but not before whispering in your ear.",
            "\nCOUNT ERIPMAV: You must remember that I'm the one in control here, I've had plenty of experience dealing with young things like you.",
            "Nobody has managed to get rid of me - I'm here to stay.\n");
   }
}
