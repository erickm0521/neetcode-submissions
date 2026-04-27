class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapa = new HashMap<>();

        for (String palabra : strs) {
            char[] chars = palabra.toCharArray();
            Arrays.sort(chars); // clave canónica

            String clave = new String(chars);

            mapa.computeIfAbsent(clave, k -> new ArrayList<>()).add(palabra);
        }

        return new ArrayList<>(mapa.values());
    }
}
