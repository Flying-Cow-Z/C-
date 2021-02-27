//大佬做的，哈希表+字符数量统计

public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.isEmpty() && magazine.isEmpty()) {
        return true;
        }

        Map<Character, Integer> rMap = new HashMap<>();
        Map<Character, Integer> mMap = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
        rMap.put(ransomNote.charAt(i), rMap.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }

        for (int i = 0; i < magazine.length(); i++) {
        mMap.put(magazine.charAt(i), mMap.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for(char c :rMap.keySet()) {
        if (mMap.get(c) == null) {
        return false;
        }
        if (rMap.get(c) > mMap.get(c)) {
        return false;
        }
        }
        return true;
        }
