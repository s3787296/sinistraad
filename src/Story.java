public class Story {
   public static String E5Story() {
      return "You stand at the entrance to the town, your town, where you grew up with your friends and family, all terrorized by the Count and his thralls. His reign of terror over the land ends today, as you set out on your journey to Castle Sinistraad to finally slay the great vampire lord once and for all.";
   }

   public static String E4Story() {
      return "Trudging through the tall grass of the field, you see the entrance to the Duskwood Forest, beyond which lies the grounds of Castle Sinistraad. As you head towards the mouth of the forest you are hailed by Old Remraf, the eccentric farmer who owns the lands surrounding the town. To the west is the forest lining, the Old Town is back down south, and to the north is the Twisted Caverns.";
   }

   public static String FarmerStory() {
      return "Old Remraf: Child! I heard word of your plan to journey onward amd finally slay that evil spirit cursing our land, but I fear you are not yet ready for such a journey! You will need a map to find your way through the forest to the castle! I happen to have one, but to get it you’ll have to prove yourself! Say... What if you go to the Twisted Caverns up north, and slay the Arachnid Queen? That will prove that you're ready for such an adventure!";
   }

   public static String E3TStory() {
      String text = "You hesitantly inch through the Twisted Caverns, hearing the scuttling of many legs emanate from deeper in the tunnels. As you head deeper, the sickly green hue of glow worms dotting the cave roof illuminates your surroundings. As you descend even further, you hear an almost alien... Chittering sound? Creepy stuff. To exit the cave, you must head back the way you came. However, if you're brave enough, you can descend and face whatever lies ahead.";
      if (Misc.containsItem("Matriarch's Blood")) {
         text = "Insert text here - no need to go into the cavern again."; // TODO Add text here - no need to go into
                                                                           // the cavern again.
      }
      return text;
   }

   public static String BeforeArachnidStory() {
      return "As you decide to bravely travel deeper, you feel spiderwebs catch against your head. The crunches and squelches of tiny spiders scurry and squish under your heavy footfalls - there are too many to avoid. After a while, you find yourself standing in front of the largest web you've seen in your life - it's bigger than you are. You pick up a rock and toss it at the web, watching as it ripples from the impact. You hear a clicking sound from above... Hesitantly looking up, you freeze in horror as eight enormous, glowing eyes pierce down through the darkness, landing on you as the source of the commotion. The Arachnid Matriarch's monstrous form scuttles her way down the man-sized web to meet you where you stand.";
   }

   public static String AfterArachnidStory() {
      return "At last, the Arachnid Matriarch lays defeated before you, oozing a sticky blue fluid from the many wounds you inflicted. You now understand the weight of the journey that lies ahead. You must now return to Old Remraf, and get his blessings for the journey ahead. The map he mentioned wouldn't hurt to have either.";
   }

   public static String FarmerReturnStory() {
      return "Olf Remraf: Ahoy, child! I can see by your bloody blade that you have defeated that nasty creature that’s been killing our beautiful cows and webbing up the crops! You’ve done the town a great service, and I can see that you truly are ready to conquer the forest and slay that evil Count! Take this map so that you may not get lost in the Duskwood Forest. Be careful - some people say that those who go into the forest come back... Different.";
   }

   public static String D4Story() {
      return "You leave the safety of the town's outer borders and step hesitantly past the forest lining, the sunlight blotted out by the dense canopy above you. The air surrounding you is heavy with damp and a sense of impending doom. The only direction that doesn’t seem to lead to more forest is east, back into the safety of the field, but you have a job to do.";
   }

   public static String D5Story() {
      return "You wander along an overgrown path - not many people have been out this way recently. As you continue, the shrubbery either side of the path becomes even more gnarled and poorly maintained, forcing you to inch along sideways as the tangle of plants older than yourself stop you from continuing any further. You must turn around and find more travelled paths.";
   }

   public static String D3Story() {
      return "You continue deeper into the forest. To the north you can see the forest start to thin out - you can almost smell the fresher air ahead. To the east lies more forest. To the south also lies more forest.";
   }

   public static String D2Story() {
      return "Breaching into a clearing, the ground gives way to a huge, quiet lake. The clear blue water glimmers, enticing you to take a dip, but your driven nature and fear of the unknown outweighs the almost gravitational pull of the blue depths. You scan the shore of the lake and - what's that? It looks like a body? Surely not... You take another look and to your disgust, your analysis was sound. The waterlogged corpse is splayed out on the shoreline, reaching towards the forest. You could investigate the mysterious corpse, or go back south into the forest.";
   }

   public static String BeforeMaidenStory() {
      return "As you approach the bloated corpse, it suddenly stirs to life, its waterlogged torso rising on distended bruised limbs, and hollow grey eyes stare menacingly at you - they were once filled with life, but no more. You could probably outrun it, or you can face it - if you dare.";
   }

   public static String AfterMaidenStory() {
      return "After a long battle, you fall to your knees, exhausted. As the sliced corpse lays before you, a ghostly spirit rises from it, moping back to the lake's waterline. It - no, she - slumps down, and you watch as she begins to sob. The glowing tears pour down her face through her hands and into the lake.";
   }

   public static String TearsFailStory() {
      return "As the tears continue to flow and glimmer as they fall into the lake, you wish you could take some with you.";
   }

   public static String TearsSucceedStory() {
      return "You hesitantly reach the ornate flask out into the transparent form of the lady of the lake, intercepting her steady flow of mystical tears, filling the goblet to the brim.";
   }

   public static String C3Story() { // @TODO Do this.
      return "You continue travelling through the Duskwood Forest, the broken path threatening to trip you up at every step. To the north, you notice another clearing - it intrigues you. You could also turn east and go even deeper into the forest.";
   }

   public static String C2Story() {
      return "As you breach the darkness of the forest into the clearing, you feel the warmth of the sun on your skin and look around the clearing. There doesn’t seem to be any other paths out of the clearings, but upon a quick scan of the tree line you see an old figure, draped in various cloths obscuring their figure, bug-eyed goggles peeking out from their moss covered cowl. You have no clue how long they’ve been posted at this spot, but you should probably investigate.";
   }

   public static String NostramusStartStory() {
      return "As you step closer, you see the obscured head of the figure turn quickly to face you before the figure jumps up in excitement “Aha! Yes! Finally, another human! Its been so long! Quick, child, take a look at my wares! Anything a young adventurer will need to survive the forest!” before they whip their cloak open to reveal various potions and a glowing gold flask encrusted in jewels and inscribed in some script lost to time.";
   }

   public static String NostramusGobletStory() {
      return "After hesitantly handing the money off for the goblet, the man in the clearing shoves the flask into your hands quickly. The flask feels dense and almost commands attention when in view. You quickly stuff it into your bag, you could probably use it to hold drinks or other liquids.";
   }

   public static String C4Story() {
      return "As you spend longer and longer in the forest, you begin to wonder what time it is. How long have you been walking? You feel like  you may be making little progress or might just be walking in circles. Continue heading west to descend deeper into the forest, or head east and succumb to your weak constitution and retreat from the forest.";
   }

   public static String B4Story() {
      return "The forest is mocking you, you feel the judgement of the trees and creatures native to these dark lands weighing on you. As you feel the paranoia of walking in the same direction for who knows how long being endlessly harassed by the monsters of the forest, you notice the path split around a tree ahead of you, and you hear faint howling to the south, louder than the usual wolves of the forest, must be the direction of their den. Or you could head west and head in the direction of the castle entrance.";
   }

   public static String B5Story() {
      return "The guttural howls of wolves ahead grow louder and louder, is the forest just playing tricks or are they sounding more and more human? You see the maw of a cave in the distance to the east, and the trees here have large claw marks like a cats scratching pole. You try to ignore the bones. You could always go north to head away from the den and back on the main path if you wish.";
   }

   public static String C5Story() {
      return "you decide to step into the cave, as soon as you do you see that there are the shadowed froms of werewolves, plucking at the corpse of some forest creature, stripping flesh from bone with ease. You could probably get a sneak attack in if you really needed to fall these beasts, or escape the way you came.";
   }

   public static String BeforeWerewolvesStory() {
      return "You as you step closer to the werewolves turned backs, the rib of a small creature cracks loudly under your foot, and the wolves immediately stop what they were focusing on to turn to the fresh meat they see you as.";
   }

   public static String AfterWerewolvesStory() {
      return "As your sword plunges into the last werewolves neck and the life fades from its wild eyes, you stand covered in blood, huffing to catch your breath. You cant believe you won. You realise that the werewolves tough hides might be perfect as armour, despite being gross.";
   }

   public static String WolfArmourStory() {
      return "You carefully peel the skin off the werewolves body, it looks so much more human without the fur, but you cant think about that. After quickly scraping the fat from the skin, you trim and loosely stitch the hide into a chest piece, this  would be decent protection from claws and teeth. ";

   }

   public static String A4Story() {
      return "Walking further again through the forests winding paths , the path appears to neaten up to the west, becoming almost trimmed and maintained, you must be approaching the castle. ";

   }

   public static String A3Story() {
      return "Before you realise you’re facing the entrance to the castle courtyard, a neat dirt path lined by tombstones crowded together, each significantly older than the last, perched above the gargantuan entrance of the Castle, a Gargoyle Statue perches unmoving, you see the key fastened to a collar on the statues neck, you’re gonna have to climb to get it.";

   }

   public static String BeforeGargoyleStory() {
      return "As you slip your boots between the cracks in the large granite bricks compromising the castle, steadily scaling the castle exterior to try and pry the key off the statues neck, you get tackled to the ground by nothing but the Gargoyle itself, not a statue but a living, breathing creature disguised as a Solid statue. The thick plates of stone like armour protect it from the landing as you scurry to your feet to defend yourself.";

   }

   public static String AfterGargoyleStory() {
      return "As you finally defeat the StoneSkin Gargoyle, Your sword managing to slip between the large granite plates protecting the most of the gargoyles body and cut at the ancient flesh underneath. The gargoyle slumps over and you manage to pull the large rusty key off its neck.";

   }

   public static String A2Story() {
      return "With a loud clunk the key turns the century old mechanism in the door, and the door grinds against the floor as it pushes open. The insides are pristine, floors swept and the candle holders stocked and lit, you hear faint sing-song humming and the clanking of a hammer on metal in a room deeper in the castle, the intricate path of the tiled marble floors leading you deeper into the castle as well.";

   }

   public static String B2Story() {
      return "As you walk through the castle landing, you feel the eyes of paintings track you. An ancient powerful family supposedly occupied this castle for longer than your town was around. The pristine marble floors cause your boots to click clack as you hesitantly enter deeper, guaranteed to attract unwanted attention.";

   }

   public static String B3Story() {
      return "You creak the door open to a small basement, that is filled with cobwebs and clearly not maintained. The smell of rotten fruits hit your nose and cause you to wince as you see the thick syrup of old wine casks leak over the floor, spilling spoiled and forgotten wine making the floor sticky and red. The room seems to have been abandoned, why would the Count not want wine? There appears to be nothing of interest in this neglected part of the castle.";

   }

   public static String B1Story() {
      return "Stepping further into the castle, you reach the end of a hallway, to the left is a large door with golden and bejewelled handles. Trying to open it, it doesn’t budge, the keyhole almost stares at you, teasing you for even trying without a key. The key you got from the Stoneskin Gargoyle would never fit To the west you hear the pleasant humming and clanking with  the hammer get louder in the next room over.";

   }

   public static String A1Story() {
      return "You hesitantly push open the door to get blasted by sweltering heat, an enclosed forge room, with a stockpile of coal, hardwood, and various metals and ores fill the corners, as a grizzled old man with leathery ashen skin hammers at a red hot sword absent mindedly. A golden key matching the aesthetics of the door dangles from a keyring on his apron.";

   }

   public static String BeforeFuegoStory() {
      return "You step around the dimly lit corners of the forge room, hoping not to draw attention as you attempt to step behind the Strange man to steal the key, he looks up bored at the door to see you left it open, muttering “what the..” as his eyes dart around the room to land on you, the intruder. “ you aren’t supposed to be here!” he shouts before raising the red hot sword to face you.";

   }

   public static String AfterFuegoStory() {
      return "You manage to get the upper hand and plunge your sword through the chest of the Forger, his last strained breath seeps out of his body as he falls back into the pile of coals. You pluck the key off his person and stash it on you. The sword that would normally have dropped back to normal temperature somehow still glows red hot and smolders on the floor.";

   }

   public static String PickupSwordStory() {
      return "Hesitantly you pick up the sword, the handle is surprisingly cool to the touch while the blade just radiates intense heat, you find a similar looking scabbard on the ground and find it perfectly blocks the heat while covering the blade. The sword feels almost weightless to wield, quite the upgrade.";

   }

   public static String C1Story() {
      return "You slip the golden key into the slot, and hear the intricate mechanism in the gilded door whirr, then click, you push the door open with ease, entering the next segement of the castle, You realise that you entered some kind of prayer room, with an altar across from two small rows of pews, all built out of wealthy materials, the pedestal almost glows on its own, dancing in the candlelight, jewelled detailing scattering it everywhere.";

   }

   public static String AltarSuccessStory() {
      return "Walking up to the altar, you notice a circular groove in the surface of the altar platform. You reach into your bag and extract the matching goblet, brimming with the mystical tears from the ghost of the lady of the lake. Gently placing the goblet into the circle, it fits with a satisfying clunk, before exploding in a flourish of mutlicoloured light, the tears almost boil off, leaving behind a couple drops of a potent elixir in the goblet cup. Holy water. You retrieve the goblet and stash it.";

   }

   public static String AltarFailStory() {
      return "Approaching the altar you notice a circular groove in the surface of the altar, you trace it with your finger, press it , nothing, it seems like you need an item to use the altar correctly.";

   }

   public static String D1Story() {
      return "You continue into the castle deeper and deeper, the air is thick with candle soot and the empty halls beckon you to the end of the hall, a humble wooden door lies before you.";

   }

   public static String E1Story() {
      return "You slam the door open, brandishing your sword as you are met with a man, dressed  an all black suit, with slicked back hair and pale, translucent skin and gaunt eyes, reading out of a tomb. ";

   }

   public static String BeforeEripmavStory() {
      return "The count raises his eyes from the tomb to meet your gaze, his cat like eyes pierce your soul. “ someone finally tries to vanquish me , its about time” he scoffs as he rises to his feet and pats dust off his suit. You finally have your chance, Better not blow it.";

   }

   public static String GoodEndingStory() {
      return "The clashing of claws and teeth on metal finally ends as you deliver the killing bow, as you strike the count across the chest, and he falls to the ground pathetically. “you really are stronger than I remember humans to be, I wont let this be my end!” the count hisses before evaporating into a cloud of smoke. You wildly slash at the cloud but your strikes just pass through the smoke, before it rises up and out of the fireplace chimney. You beat him for today. Who knows how long you’ve defeated him for.\r\n"
            + //
            "Great Ending\r\n";
   }

   public static String GreatEndingStory() {
      return "The clashing of claws and teeth on metal finally ends as you deliver the killing blow, as you strike the count across the chest he falls to the ground pathetically. “ you really are stronger than I remember humans to be, I wont let this be my end!” the count hisses and turns into a cloud of smoke. The goblet of holy water in your pocket almost sings to you, and you quickly pull out the goblet and flick it towards the cloud of smoke. The flecks of holy water force the count out of his smoke form and he slumps to the ground screeching and writhing, the spots of holy water you continue to flick on him burning holes through his clothes and skin. “ NO! THIS CANT BE! I CANT DIE LIKE THIS” he shouts as you hold the goblet upside down over his melting body, the last drop of holy water falls on his head and the body of the count turns to ash on the ground. Dead. You did it! You finally beat the count for good!";

   }

   public static String BadEndingStory() {
      return "You swing wildly at the count, as you try to vanquish the foe, but one wrong step has his claws slash at your chest, spilling too much blood for a mere mortal. Despite all your efforts, you lost. You collapse face down on the floor of the counts room as he laughs maniacally. “ your pathetic town will be overran by years end, humans will always be weak.”";
   }
}
