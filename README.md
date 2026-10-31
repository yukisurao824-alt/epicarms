# Epic Arms (Forge 1.20.1, Epic Fight addon)

Adds 4 weapons + 2 fist weapons that use existing Epic Fight movesets.
Weapon styles are set by JSON in `src/main/resources/data/epicarms/capabilities/weapons/`.
Change `"type"` there to switch a weapon's moveset (use Epic Fight's in-game Datapack Editor to see valid IDs).

## Build from your phone (GitHub Actions)
1. Make a GitHub repo, upload these files (keep the folder structure, including `.github`).
2. Open the repo > Actions tab > "Build mod" > Run workflow.
3. When it finishes, download the `epicarms-jar` artifact, unzip it, and put the .jar in Zalith's mods folder.

## Build on a PC
Install JDK 17 + Gradle 8.1.1, then run `gradle build`. The jar appears in `build/libs/`.

Requires Forge 1.20.1 (47.x) + Epic Fight.
