(ns clojure-koans.problem015)
  ;Problem #
  (defn problem
    [part1 part2]
    (and 
      (= (part1 part2  2) 4)
      (= (part1 part2 3) 6)
      (= (part1 part2 11) 22)
      (= (part1 part2 7) 14)))

(problem * 2)
