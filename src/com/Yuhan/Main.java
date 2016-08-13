package com.Yuhan;

import bot.Bot;
import sx.blah.discord.api.*;
import sx.blah.discord.util.*;

public class Main {

    private static String TOKEN = "MjE0MDMxNDQ1NzQyNTgzODA4.CpDITQ.BbQrbt9IA4pn-o9h3oLIS2TjH9A";

    public static IDiscordClient client;

    public static void main(String[] args) throws DiscordException {
        client = new ClientBuilder().withToken(TOKEN).login();
        client.getDispatcher().registerListener(new Bot());
    }
}
