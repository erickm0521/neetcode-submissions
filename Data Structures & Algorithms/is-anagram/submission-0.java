class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> conteo = new HashMap<>();
        // Contar caracteres de s1
        for (char c : s.toCharArray()) {
            conteo.put(c, conteo.getOrDefault(c, 0) + 1);
        }

        // Restar con s2
        for (char c : t.toCharArray()) {
            if (!conteo.containsKey(c)) {
                return false; // carácter no existe
            }

            conteo.put(c, conteo.get(c) - 1);

            if (conteo.get(c) < 0) {
                return false; // más ocurrencias en s2
            }
        }

        return true;
    }
}
