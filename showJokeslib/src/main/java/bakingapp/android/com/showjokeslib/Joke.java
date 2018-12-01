package bakingapp.android.com.showjokeslib;

import java.util.Random;

public class Joke {

    public static String getJoke() {

        String jokes[] = {
                "A man asks a farmer near a field, “Sorry sir, would you mind if I crossed your field instead of going around it? You see, I have to catch the 4:23 train. The farmer says, “Sure, go right ahead. And if my bull sees you, you’ll even catch the 4:11 one.",
                " Anton, do you think Im a bad mother? My name is Paul",
                "Doctor: I'm sorry but you suffer from a terminal illness and have only 10 to live.Patient: What do you mean, 10? 10 what? Months? Weeks?! Doctor: Nine"
        };

        int jokeId = new Random().nextInt(jokes.length);
        return jokes[jokeId];
    }
}
