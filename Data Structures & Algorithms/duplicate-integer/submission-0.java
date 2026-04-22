class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> vistos = new HashSet<>();
        for (int num : nums) {
            if (!vistos.add(num)) {
                return true; // ya estaba → duplicado
            }
        }
        return false; // no hubo duplicados
    }
}