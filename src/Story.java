public class Story {
   
   // This class contains methods to return the descriptions for each location.
   // Some methods contain logic to determine whether items need to be added to a player's inventory after defeating a boss.

   public static String e5Story() {
      if (!Game.player.getPlayerItems().contains(ItemList.herosSword())) {
         Game.player.getPlayerItems().add(ItemList.herosSword());
      }
      return "You stand in the barren town square of your village. It's no longer the same joy-filled place where you and your closest friends grew up, surrounded by family who loved you."
            + "\n" +
            "His reign of terror over the land ends with you, as you set out on your journey to Castle Sinistraad to finally slay whatever evil lurks inside.";
            // TODO You inherited this sword from your father. It's a comfort to you, it protected him from many things, and it shall protect you as well.
   }

   public static String e4Story() {
      return "Trudging through the tall grass of the field, you see the entrance to the Duskwood Forest, beyond which lies the grounds of Castle Sinistraad."
            + "\n" +
            "As you head towards the mouth of the forest you are hailed by Old Remraf, the eccentric farmer who owns the lands surrounding the town."
            + "\n" +
            "To the west is the forest lining, the Old Town is back down south, and to the north is the Twisted Caverns.";
   }

   public static String farmerStory() {
      return "OLD REMRAF: Child! I heard word of your plan to journey onward and finally slay that evil spirit cursing our land, but I fear you are not yet ready for such a journey!"
            + "\n" +
            "You will need a map to find your way through the forest to the castle! I happen to have one, but to get it you'll have to prove yourself!"
            + "\n" +
            "Say... What if you go to the Twisted Caverns up north, and slay the Arachnid Queen? That will prove that you're ready for such an adventure!";
   }

   public static String farmerReturnStory() {
      if (!Game.player.getPlayerItems().contains(ItemList.herosMap())) {
         Game.player.getPlayerItems().add(ItemList.herosMap());
      }
      return "OLD REMRAF: Ahoy, child! I can see by your bloody blade that you have defeated that nasty creature that's been killing our beautiful cows and webbing up the crops!"
            + "\n" +
            "You've done the town a great service, and I can see that you truly are ready to conquer the forest and slay that evil Count!"
            + "\n" +
            "I'm giving you this map so that you may not get lost in the Duskwood Forest."
            + "\n" + 
            "Take this map so that you may not get lost in the Duskwood Forest. Be careful - I've seen many a traveller enter, but none return...";
   }

   public static String e3Story() {
      return "You stand at the cave entrance, the scuttling of hundreds of many-legged creatures emanating from within."
            + "\n" +
            "You never did like spiders.";
   }

   public static String beforeArachnidStory() {
      return "You hesitantly inch through the Twisted Caverns, feeling spiderwebs catch against your head. The crunches and squelches of tiny spiders scurry and squish under your heavy footfalls - there are too many to avoid."
            + "\n" +
            "After a while, you find yourself standing in front of the largest web you've seen in your life - it's bigger than you are."
            + "\n" +
            "You pick up a rock and toss it at the web, watching as it ripples from the impact. You hear a clicking sound from above..."
            + "\n" +
            "Hesitantly looking up, you freeze in horror as eight enormous, glowing eyes pierce down through the darkness, landing on you as the source of the commotion."
            + "\n" +
            "The Arachnid Matriarch's monstrous form scuttles her way down the man-sized web to meet you where you stand.";
   }

   public static String afterArachnidStory() {
      if (!Game.player.getPlayerItems().contains(ItemList.matriarchsBlood())) {
         Game.player.getPlayerItems().add(ItemList.matriarchsBlood());
      }
      return "At last, the Arachnid Matriarch lays defeated before you, oozing a sticky blue fluid from the many wounds you inflicted. You now understand the weight of the journey that lies ahead."
            + "\n" +
            "You must now return to Old Remraf, and get his blessings for the journey ahead. The map he mentioned wouldn't hurt to have either.";
   }

   public static String d4Story() {
      return "You're just outside the safety of the town's outer borders, stepping hestitantly through the forest lining, the sunlight blotted out by the dense canopy above you."
            + "\n" +
            "The air surrounding you is heavy with damp and a sense of impending doom. The only direction that doesn’t seem to lead to more forest is east, back into the safety of the field, but you have a job to do.";
   }

   public static String d5Story() {
      return "You wander along an overgrown path - not many people have been out this way recently."
            + "\n" +
            "As you continue, the shrubbery either side of the path becomes even more gnarled and poorly maintained. You are forced to inch along sideways as the tangle of plants older than yourself eventually stop you from continuing any further."
            + "\n" +
            "You must turn around and find more travelled paths.";
   }

   public static String d3Story() {
      return "You continue further into the forest. To the north you can see the forest start to thin out, beyond which lies a sandy shore."
            + "\n" +
            "To the east lies more forest."
            + "\n" +
            "To the south also lies more forest.";
   }

   public static String d2Story() {
      return "Breaching into a clearing, the shore gives way to an enormous, quiet lake. It is unnaturally quiet - there is no birdsong or the chirp of insects." + "\n" +
            "The clear blue water glimmers, enticing you to take a dip, but your driven nature and fear of the unknown outweighs the almost gravitational pull of the blue depths. ";
   }

   public static String beforeMaidenStory() {
      return "You scan the shore of the lake and - what's that?\nIt looks like a body?\nSurely not... You take another look and to your disgust, your analysis was sound."
            + "\n" +
            "The waterlogged corpse is splayed out on the shoreline, reaching towards the forest."
            + "\n" +
            "As you approach the bloated corpse, it suddenly stirs to life, its waterlogged torso rising on distended bruised limbs, and hollow grey eyes stare menacingly at you - they were once filled with life, but no more."
            + "\n" +
            "You could probably outrun it, or you can face it - if you dare.";
   }

   public static String afterMaidenStory() {
      if (!Game.player.getPlayerItems().contains(ItemList.maidensBlessing())) {
         Game.player.getPlayerItems().add(ItemList.maidensBlessing());
      }
      return "After a long battle, you fall to your knees, exhausted. As the sliced corpse lays before you, a ghostly spirit rises from it, moping back to the lake's waterline."
            + "\n" +
            "It - no, she - slumps down, and you watch as she begins to sob. The glowing tears pour down her face through her hands and into the lake.";
   }

   public static String tearsFailStory() {
      if (!Game.player.getPlayerItems().contains(ItemList.emptyGoblet())){
      } return "As the tears continue to flow and glimmer as they fall into the lake, you wish you could take some with you.";
   }

   public static String tearsSucceedStory() {
      if (Game.player.getPlayerItems().contains(ItemList.maidensBlessing())) {
         if (Game.player.getPlayerItems().contains(ItemList.emptyGoblet())) {
            Game.player.getPlayerItems().remove(ItemList.emptyGoblet());
            Game.player.getPlayerItems().add(ItemList.filledGoblet());
         }
      }
      return "You hesitantly reach the ornate goblet out into the transparent form of the Lost Maiden, intercepting her steady flow of mystical tears, filling the goblet to the brim.";
   }

   public static String c3Story() {
      return "You continue travelling through the Duskwood Forest, the broken path threatening to trip you up at every step."
            + "\n" +
            "To the north, you notice another clearing - it intrigues you."
            + "\n" +
            "You could also turn east and go even deeper into the forest.";
   }

   public static String c2Story() { // TODO Story edits from here.
      return "As you emerge from the darkness of the forest, you feel the warmth of the sun on your skin and look around the clearing."
            + "\n" +
            "It's a dead end, but it's still full of life - a wrinkled figure draped in all manner of fabrics wanders around the clearing, humming to themself. They glance over at you through their goggles, excitement gleaming in their bug-like eyes."
            + "\n" +
            "You have no clue how long they've been posted at this spot, but you feel like they could probably use a chat.";
   }

   // TODO Check this vs. apothecary in Encounters class
   public static String nostramusStartStory() {
      return "As you step closer, he smiles at you, and it seems genuine. You feel like you're meeting an old friend."
            + "\n" +
            "They open their cloak open to reveal various potions and a golden goblet inscribed with mesmerising patterns.";
   }

   public static String nostramusGobletStory() {
      if ((!Game.player.getPlayerItems().contains(ItemList.emptyGoblet()))
         && (!Game.player.getPlayerItems().contains(ItemList.filledGoblet()))
         && (!Game.player.getPlayerItems().contains(ItemList.blessedGoblet()))) {
            Game.player.getPlayerItems().add(ItemList.emptyGoblet());
         }
      return "After handing your money over, Nostramus hands you the goblet."
            + "\n" +
            "The goblet feels dense and almost commands attention when in view. You quickly stuff it into your bag, you could probably use it to hold drinks or other liquids.";
   }

   public static String c4Story() {
      return "As you spend longer and longer in the forest, you begin to wonder what time it is. How long have you been walking?"
            + "\n" +
            "You feel like you may be making little progress or might just be walking in circles."
            + "\n" +
            "Continue heading west to descend deeper into the forest, or head east and succumb to your weak constitution and retreat from the forest.";
   }

   public static String b4Story() {
      return "The forest is mocking you, you feel the judgement of the trees and creatures native to these dark lands weighing on you."
            + "\n" +
            "As you feel the paranoia of walking in the same direction for who knows how long being endlessly harassed by the monsters of the forest, you notice the path split around a tree ahead of you."
            + "\n" +
            "You hear faint howling to the south, louder than the usual wolves of the forest, must be the direction of their den."
            + "\n" +
            "Or you could head west and head in the direction of the castle entrance.";
   }

   public static String b5Story() {
      return "The guttural howls of wolves ahead grow louder and louder, is the forest just playing tricks or are they sounding more and more human?"
            + "\n" +
            "You see the maw of a cave in the distance to the east, and the trees here have large claw marks like a cats scratching pole. You try to ignore the bones."
            + "\n" +
            "You could always go north to head away from the den and back on the main path if you wish.";
   }

   public static String c5Story() {
      return "You decide to step into the cave, as soon as you do you see that there are the shadowed froms of werewolves, plucking at the corpse of some forest creature, stripping flesh from bone with ease."
            + "\n" +
            "You could probably get a sneak attack in if you really needed to fall these beasts, or escape the way you came.";
   }

   // TODO Werewolves Text for Explore.explore() here & below
   public static String beforeWerewolvesStory() {
      return "You as you step closer to the werewolves turned backs, the rib of a small creature cracks loudly under your foot, and the wolves immediately stop what they were focusing on to turn to the fresh meat they see you as.";
   }

   public static String afterWerewolvesStory() {
      if (!Game.player.getPlayerItems().contains(ItemList.wolfhideArmour())) {
         Game.player.getPlayerItems().add(ItemList.wolfhideArmour());
      }
      return "As your sword plunges into the last werewolves neck and the life fades from its wild eyes, you stand covered in blood, huffing to catch your breath."
            + "\n" +
            "You cant believe you won. You realise that the werewolves tough hides might be perfect as armour, despite being gross."
            + "\n" +
            "You carefully peel the skin off the werewolves body, it looks so much more human without the fur, but you cant think about that."
            + "\n" +
            "After scraping the fat from the skin, you trim and loosely stitch the hide into a chest piece. This'll do.";
   }

   public static String a4Story() {
      return "Walking further again through the forest's winding paths, the path appears to neaten up to the west, becoming almost trimmed and maintained. You must be approaching the castle.";
   }

   public static String a3Story() {
      return "Before you realise you're facing the entrance to the castle courtyard, a neat dirt path lined by tombstones crowded together, each significantly older than the last."
            + "\n" +
            "Perched upon the entrance of the Castle sits a gargoyle statue, unmoving. You see a large, rusty key fastened to a collar on the statues neck. It looks like the key to the castle door will be a little more difficult to acquire.";
   }

   // Text for Explore.explore() here & below
   public static String beforeGatekeeperSyek() {
      return "You slip your boots between the cracks in the large granite bricks at the castle's entrance, steadily scaling the castle exterior to reach the key." + "\n" + 
            "As you're busy trying to pry the key off the statue's neck, hanging onto the ledge for balance, a loud yell startles you and causes you to lose your balance. You fall to the ground, the wind knocked from your chest."
            + "\n" +
            "GATEKEEPER SYEK: Oi! That ain't the real key, you know? That's a decoy, and it's done its job. Now it's time for me to do mine - strangers aren't allowed in the castle."
            + "\n" +
            "The gatekeeper draws his blade from its sheath, turning it towards you. You scramble to your feet as you prepare to defend yourself.";
   }

   public static String afterGatekeeperSyek() {
      if (!Game.player.getPlayerItems().contains(ItemList.gateKey())) {
         Game.player.getPlayerItems().add(ItemList.gateKey());
      }
      return "The gatekeeper falls to the floor, exhausted. His makeshift armour is falling apart from the cuts your sword has made, and his body is covered in his own sweat, blood, and tears." + "\n" +
            "GATEKEEPER SYEK: I beg of you, please don't kill me. I'll give you the key - please, just let me leave with my life." + "\n" + 
            "You decide to show him mercy - there's no reason to kill for pleasure, after all.";
   }

   public static String a2Story() {
      return "With a loud clunk the key turns the century old mechanism in the door, and the door grinds against the floor as it pushes open."
            + "\n" +
            "The insides are pristine, floors swept and the candle holders stocked and lit."
            + "\n" +
            "A sing-song hum and the clanking of a hammer echo throughout the hall. The intricate pattern of the marble floor winds deeper into the castle.";
   }

   public static String b2Story() {
      return "As you walk through the castle landing, you feel the eyes of paintings track you."
            + "\n" +
            "It was common knowledge that some powerful, ancient family had occupied this castle for longer than your town was around."
            + "\n" +
            "The pristine marble floors cause your boots to click clack as you hesitantly enter deeper, guaranteed to attract unwanted attention.";
   }

   public static String b3Story() {
      return "You creak the door open to a small basement, that is filled with cobwebs and clearly not maintained."
            + "\n" +
            "The smell of rotten fruit hits your nose and cause you to wince as you see the thick syrup of old wine casks leak over the floor, spilling spoiled and forgotten wine making the floor sticky and red."
            + "\n" +
            "The room seems to have been abandoned, why would the Count not want wine? There appears to be nothing of interest in this neglected part of the castle.";
   }

   public static String b1Story() { // TODO Key for doorway into cathedral.
      return "Stepping further into the castle, you reach the end of a hallway, to the left is a large door with golden and bejewelled handles."
            + "\n" +
            "Trying to open it, it doesn't budge, the keyhole almost stares at you, teasing you for even trying without a key."
            + "\n" +
            "The key that opened the entrance door would never fit. To the west you hear the pleasant humming and clanking with the hammer.";
   }

   public static String a1Story() {
      return "You hesitantly push open the door to get blasted by sweltering heat, an enclosed forge room, with a stockpile of coal, hardwood, and various metals and ores fill the corners."
            + "\n" +
            "A grizzled old man with leathery ashen skin hammers at a red hot sword absentmindedly. A golden key matching the aesthetics of the door dangles from a keyring on his apron.";
   }

   public static String beforeFuegoStory() {
      return "You step around the dimly lit corners of the forge room, hoping not to draw attention as you attempt to step behind the Strange man to steal the key."
            + "\n" +
            "He glances up at the open door, eyes darting arount the room to land on you, the intruder."
            + "\n" +
            "Forgemaster Fuego: Hey, wh- You aren't supposed to be here! he shouts before raising the red hot sword to your face.";
   }

   public static String afterFuegoStory() {
      if (!Game.player.getPlayerItems().contains(ItemList.forgemastersGreatsword())) {
         Game.player.getPlayerItems().add(ItemList.forgemastersGreatsword());
      }
      return "You manage to get the upper hand and plunge your sword through the chest of the Forgemaster, his last strained breath seeps out of his body as he falls back into the pile of coals."
            + "\n" +
            "You pluck the key off his person and stash it on you. The sword that would normally have dropped back to normal temperature somehow still glows red hot and smolders on the floor."
            + "\n" +
            "Hesitantly you pick up the sword, the handle is surprisingly cool to the touch while the blade just radiates intense heat."
            + "\n" +
            "You find a similar looking scabbard on the ground and find it perfectly blocks the heat while covering the blade."
            + "\n" +
            "The sword feels almost weightless to wield, quite the upgrade.";
   }

   // Cathedral. TODO Add text for player not having key
   // TODO Altar text here & below
   public static String c1Story() {
      return "You slip the golden key into the slot, and hear the intricate mechanism in the gilded door whirr, then click."
            + "\n" +
            "You push the door open with ease, entering the next segement of the castle."
            + "\n" +
            "You realise that you entered some kind of prayer room, with an altar across from two small rows of pews, all built out of expensive materials."
            + "\n" +
            "The pedestal almost glows on its own, the intricate patterns warping the light of the candles in the room.";
}

   public static String altarSuccessStory() {
      return "Walking up to the altar, you're reminded of the patterns on the goblet you bought."
            + "\n" +
            "You reach into your bag and extract the matching goblet, brimming with the tears from the ghost of the Lost Maiden."
            + "\n" +
            "Gently placing the goblet into a lowered groove on the altar, it fits with a satisfying clunk, before exploding in a flourish of mutlicoloured light."
            + "\n" +
            "The tears almost boil off, leaving behind a couple drops of a potent elixir in the goblet. Holy water. You retrieve the goblet and stash it in your bag.";
   }

   public static String altarFailStory() {
      return "Crossing the room, you notice a circular groove in the surface of the altar. You spend a few moments tracing the groove and the intricate patterns with your fingers, pressing and pushing."
            + "\n" +
            "It seems like you need an item to use the altar correctly.";
   }

   public static String d1Story() {
      return "You continue deeper into the castle. The air is thick with candle soot and the empty halls beckon you to the end of the hall. A humble wooden door lies before you.";
   }

   // TODO Count Eripmav Text for Explore.explore() here & below
   public static String e1Story() {
      return "You slam the door open, brandishing your sword as you are met with a man, dressed in an all black suit, with slicked back hair and pale, translucent skin and gaunt eyes, lounging in an open casket.";
   }

   public static String beforeEripmavStory() {
      return "The man raises his eyes from the tomb to meet your gaze, his cat-like eyes piercing your soul."
            + "\n" +
            "COUNT ERIPMAV: Finally! Someone else has come to meet their demise. I could use another feed..."
            + "\n" +
            "The Count scoffs as he rises to his feet, patting the dust off his suit."
            + "\n" +
            "You finally have your chance to defeat him. Better not blow it.";
   }

   public static String goodEndingStory() {
      return "The clashing of claws and teeth on metal finally ends as you deliver the killing bow, as you strike the count across the chest."
            + "\n" +
            "He falls to the ground pathetically. you really are stronger than I remember humans to be, I wont let this be my end! the count hisses before evaporating into a cloud of smoke. You wildly slash at the cloud but your strikes just pass through the smoke, before it rises up and out of the fireplace chimney. You beat him for today. Who knows how long you’ve defeated him for.\r\n"
            + //
            "Great Ending\r\n";
   }

   public static String greatEndingStory() {
      return "The clashing of claws and teeth on metal finally ends as you deliver the killing blow, as you strike the count across the chest he falls to the ground pathetically."
            + "\n" +
            "COUNT ERIPMAV: You really are stronger than I remember humans to be, I wont let this be my end!" + "\n" +
            "The count hisses, turning into a cloud of smoke. The goblet of holy water in your pocket almost sings to you, and you quickly pull out the goblet and flick it towards the cloud of smoke."
            + "\n" +
            "The droplets of holy water force the Count out of his smoke form and he slumps to the ground screeching and writhing."
            + "\n" +
            "The spots of holy water you continue to flick on him burning holes through his clothes and skin." + "\n" +
            "COUNT ERIPMAV: NO! THIS CANT BE! I CANT DIE LIKE THIS he shouts as you hold the goblet upside down over his melting body, the last drop of holy water falls on his head and the body of the count turns to ash on the ground."
            + "\n" +
            "Dead. You did it! You finally beat the count for good!";
   }

   public static String badEndingStory() {
      return "You swing wildly at the count, as you try to vanquish the foe, but one wrong step has his claws slash at your chest, spilling too much blood for a mere mortal."
            + "\n" +
            "Despite all your efforts, you lost. You collapse face down on the floor of the counts room as he laughs maniacally."
            + "\n" +
            "COUNT ERIPMAV: Your pathetic town will be gone by years end, humans will always be weak.";
   }
}
