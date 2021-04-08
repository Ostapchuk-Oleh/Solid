interface AutoSet {
    getOpelSet(): any;
    getMazdaSet(): any;
    getLadaSet(): any;
}
class Opel implements AutoSet {
    getOpelSet(): any { };
    getMazdaSet(): any { };
    getLadaSet(): any { };
}
class Mazda implements AutoSet {
    getOpelSet(): any { };
    getMazdaSet(): any { };
    getLadaSet(): any { };
}
class Lada implements AutoSet {
    getOpelSet(): any { };
    getMazdaSet(): any { };
    getLadaSet(): any { };
}
interface OpelSet {
    getOpelSet(): any;
}
interface MazdaSet {
    getMazdaSet(): any;
}
interface LadaSet {
    getLadaSet(): any;
}
class Opel implements AutoSet {
    getOpelSet (): any { };
}
class Mazda implements AutoSet {
    getMazdaSet (): any { };
}
class Lada implements AutoSet {
    getLadaSet (): any { };
}