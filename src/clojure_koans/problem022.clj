(ns clojure-koans.problem022)
  ;Problem #
  (defn problem
    [answer]
    (and 
      (= (answer '(1 2 3 3 1)) 5)
      (= (answer "Hello World") 11)
      (= (answer [[1 2] [3 4] [5 6]]) 3)
      (= (answer '(13)) 1)
      (= (answer '(:a :b :c)) 3)))


(problem (fn 
          [xs]
          (reduce #(+ %1 %2) 0 (map (fn [x] 1) (seq xs)))))


