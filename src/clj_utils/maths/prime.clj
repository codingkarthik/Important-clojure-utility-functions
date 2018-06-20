(ns clj-utils.maths.prime)

(defn prime? [x]
  (loop [i 2]
    (cond

      (or (= x 0) (= x 1)) false

      (> (* i i) x) true

      (zero? (mod x i)) false

      :else
      (recur (inc i)))))

(defn prime-1? [n]
  (or (= 2 n)
      (= 3 n)
      (and (> n 1)
           (odd? n)
           (not-any?
            (partial divides? n)
            (range 3 (inc (Math/sqrt n)) 2)))))
