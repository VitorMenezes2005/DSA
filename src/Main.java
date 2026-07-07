import services.FrequencyMaps;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    // FREQUENCY MAPS
    Map<Character, Integer> freq = FrequencyMaps.frequencyMap("BANANA");
    System.out.println(freq);
}
