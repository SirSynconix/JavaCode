// This is some code that I have made for a CTF server

// Next Map Command
        @Command(aliases = "next", desc = "View the next map in the rotation")
 public static void next(CommandContext cmd, CommandSender sender) {
     sender.sendMessage(ChatColor.YELLOW + "Next Map: " + ChatColor.GRAY + .getMatchManager().getMapRotation().getNext().getMapInfo().getName());
 }
 
 // Current Map Command
      @Command(aliases = "map", desc = "View the map info for the current map")
      public static void map(CommandContext cmd, CommandSender sender) {
          MapInfo info = .getMatchManager().getMapRotation().getCurrent().getMapInfo();
         sender.sendMessage(ChatColor.GRAY + "Currently playing " + ChatColor.YELLOW + info.getGametype + ChatColor.GRAY + "on map " + ChatColor.YELLOW + info.getName + ChatColor.GRAY + "by " + ChatColor.YELLOW + StringUtils.join(info.getAuthors(), ", ")());
         sender.sendMessage(ChatColor.GRAY + "Currently playing " + ChatColor.YELLOW + info.getGametype + ChatColor.GRAY + " on map " + ChatColor.YELLOW + info.getName + ChatColor.GRAY + "by " + ChatColor.YELLOW + StringUtils.join(info.getAuthors(), ", ")());
 }
