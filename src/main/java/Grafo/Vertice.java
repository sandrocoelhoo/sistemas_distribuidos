/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package Grafo;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Vertice implements org.apache.thrift.TBase<Vertice, Vertice._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Vertice");

  private static final org.apache.thrift.protocol.TField NOME_FIELD_DESC = new org.apache.thrift.protocol.TField("nome", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField COR_FIELD_DESC = new org.apache.thrift.protocol.TField("cor", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField DESCRICAO_FIELD_DESC = new org.apache.thrift.protocol.TField("descricao", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PESO_FIELD_DESC = new org.apache.thrift.protocol.TField("peso", org.apache.thrift.protocol.TType.DOUBLE, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new VerticeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new VerticeTupleSchemeFactory());
  }

  public int nome; // required
  public int cor; // required
  public String descricao; // required
  public double peso; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NOME((short)1, "nome"),
    COR((short)2, "cor"),
    DESCRICAO((short)3, "descricao"),
    PESO((short)4, "peso");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NOME
          return NOME;
        case 2: // COR
          return COR;
        case 3: // DESCRICAO
          return DESCRICAO;
        case 4: // PESO
          return PESO;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __NOME_ISSET_ID = 0;
  private static final int __COR_ISSET_ID = 1;
  private static final int __PESO_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NOME, new org.apache.thrift.meta_data.FieldMetaData("nome", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COR, new org.apache.thrift.meta_data.FieldMetaData("cor", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DESCRICAO, new org.apache.thrift.meta_data.FieldMetaData("descricao", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PESO, new org.apache.thrift.meta_data.FieldMetaData("peso", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Vertice.class, metaDataMap);
  }

  public Vertice() {
  }

  public Vertice(
    int nome,
    int cor,
    String descricao,
    double peso)
  {
    this();
    this.nome = nome;
    setNomeIsSet(true);
    this.cor = cor;
    setCorIsSet(true);
    this.descricao = descricao;
    this.peso = peso;
    setPesoIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Vertice(Vertice other) {
    __isset_bitfield = other.__isset_bitfield;
    this.nome = other.nome;
    this.cor = other.cor;
    if (other.isSetDescricao()) {
      this.descricao = other.descricao;
    }
    this.peso = other.peso;
  }

  public Vertice deepCopy() {
    return new Vertice(this);
  }

  @Override
  public void clear() {
    setNomeIsSet(false);
    this.nome = 0;
    setCorIsSet(false);
    this.cor = 0;
    this.descricao = null;
    setPesoIsSet(false);
    this.peso = 0.0;
  }

  public int getNome() {
    return this.nome;
  }

  public Vertice setNome(int nome) {
    this.nome = nome;
    setNomeIsSet(true);
    return this;
  }

  public void unsetNome() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NOME_ISSET_ID);
  }

  /** Returns true if field nome is set (has been assigned a value) and false otherwise */
  public boolean isSetNome() {
    return EncodingUtils.testBit(__isset_bitfield, __NOME_ISSET_ID);
  }

  public void setNomeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NOME_ISSET_ID, value);
  }

  public int getCor() {
    return this.cor;
  }

  public Vertice setCor(int cor) {
    this.cor = cor;
    setCorIsSet(true);
    return this;
  }

  public void unsetCor() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COR_ISSET_ID);
  }

  /** Returns true if field cor is set (has been assigned a value) and false otherwise */
  public boolean isSetCor() {
    return EncodingUtils.testBit(__isset_bitfield, __COR_ISSET_ID);
  }

  public void setCorIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COR_ISSET_ID, value);
  }

  public String getDescricao() {
    return this.descricao;
  }

  public Vertice setDescricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

  public void unsetDescricao() {
    this.descricao = null;
  }

  /** Returns true if field descricao is set (has been assigned a value) and false otherwise */
  public boolean isSetDescricao() {
    return this.descricao != null;
  }

  public void setDescricaoIsSet(boolean value) {
    if (!value) {
      this.descricao = null;
    }
  }

  public double getPeso() {
    return this.peso;
  }

  public Vertice setPeso(double peso) {
    this.peso = peso;
    setPesoIsSet(true);
    return this;
  }

  public void unsetPeso() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PESO_ISSET_ID);
  }

  /** Returns true if field peso is set (has been assigned a value) and false otherwise */
  public boolean isSetPeso() {
    return EncodingUtils.testBit(__isset_bitfield, __PESO_ISSET_ID);
  }

  public void setPesoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PESO_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NOME:
      if (value == null) {
        unsetNome();
      } else {
        setNome((Integer)value);
      }
      break;

    case COR:
      if (value == null) {
        unsetCor();
      } else {
        setCor((Integer)value);
      }
      break;

    case DESCRICAO:
      if (value == null) {
        unsetDescricao();
      } else {
        setDescricao((String)value);
      }
      break;

    case PESO:
      if (value == null) {
        unsetPeso();
      } else {
        setPeso((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NOME:
      return Integer.valueOf(getNome());

    case COR:
      return Integer.valueOf(getCor());

    case DESCRICAO:
      return getDescricao();

    case PESO:
      return Double.valueOf(getPeso());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NOME:
      return isSetNome();
    case COR:
      return isSetCor();
    case DESCRICAO:
      return isSetDescricao();
    case PESO:
      return isSetPeso();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Vertice)
      return this.equals((Vertice)that);
    return false;
  }

  public boolean equals(Vertice that) {
    if (that == null)
      return false;

    boolean this_present_nome = true;
    boolean that_present_nome = true;
    if (this_present_nome || that_present_nome) {
      if (!(this_present_nome && that_present_nome))
        return false;
      if (this.nome != that.nome)
        return false;
    }

    boolean this_present_cor = true;
    boolean that_present_cor = true;
    if (this_present_cor || that_present_cor) {
      if (!(this_present_cor && that_present_cor))
        return false;
      if (this.cor != that.cor)
        return false;
    }

    boolean this_present_descricao = true && this.isSetDescricao();
    boolean that_present_descricao = true && that.isSetDescricao();
    if (this_present_descricao || that_present_descricao) {
      if (!(this_present_descricao && that_present_descricao))
        return false;
      if (!this.descricao.equals(that.descricao))
        return false;
    }

    boolean this_present_peso = true;
    boolean that_present_peso = true;
    if (this_present_peso || that_present_peso) {
      if (!(this_present_peso && that_present_peso))
        return false;
      if (this.peso != that.peso)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Vertice other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Vertice typedOther = (Vertice)other;

    lastComparison = Boolean.valueOf(isSetNome()).compareTo(typedOther.isSetNome());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNome()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nome, typedOther.nome);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCor()).compareTo(typedOther.isSetCor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCor()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cor, typedOther.cor);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDescricao()).compareTo(typedOther.isSetDescricao());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescricao()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.descricao, typedOther.descricao);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPeso()).compareTo(typedOther.isSetPeso());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPeso()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.peso, typedOther.peso);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Vertice(");
    boolean first = true;

    sb.append("nome:");
    sb.append(this.nome);
    first = false;
    if (!first) sb.append(", ");
    sb.append("cor:");
    sb.append(this.cor);
    first = false;
    if (!first) sb.append(", ");
    sb.append("descricao:");
    if (this.descricao == null) {
      sb.append("null");
    } else {
      sb.append(this.descricao);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("peso:");
    sb.append(this.peso);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class VerticeStandardSchemeFactory implements SchemeFactory {
    public VerticeStandardScheme getScheme() {
      return new VerticeStandardScheme();
    }
  }

  private static class VerticeStandardScheme extends StandardScheme<Vertice> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Vertice struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NOME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.nome = iprot.readI32();
              struct.setNomeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COR
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.cor = iprot.readI32();
              struct.setCorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DESCRICAO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.descricao = iprot.readString();
              struct.setDescricaoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PESO
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.peso = iprot.readDouble();
              struct.setPesoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Vertice struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(NOME_FIELD_DESC);
      oprot.writeI32(struct.nome);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(COR_FIELD_DESC);
      oprot.writeI32(struct.cor);
      oprot.writeFieldEnd();
      if (struct.descricao != null) {
        oprot.writeFieldBegin(DESCRICAO_FIELD_DESC);
        oprot.writeString(struct.descricao);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PESO_FIELD_DESC);
      oprot.writeDouble(struct.peso);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class VerticeTupleSchemeFactory implements SchemeFactory {
    public VerticeTupleScheme getScheme() {
      return new VerticeTupleScheme();
    }
  }

  private static class VerticeTupleScheme extends TupleScheme<Vertice> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Vertice struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNome()) {
        optionals.set(0);
      }
      if (struct.isSetCor()) {
        optionals.set(1);
      }
      if (struct.isSetDescricao()) {
        optionals.set(2);
      }
      if (struct.isSetPeso()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetNome()) {
        oprot.writeI32(struct.nome);
      }
      if (struct.isSetCor()) {
        oprot.writeI32(struct.cor);
      }
      if (struct.isSetDescricao()) {
        oprot.writeString(struct.descricao);
      }
      if (struct.isSetPeso()) {
        oprot.writeDouble(struct.peso);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Vertice struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.nome = iprot.readI32();
        struct.setNomeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.cor = iprot.readI32();
        struct.setCorIsSet(true);
      }
      if (incoming.get(2)) {
        struct.descricao = iprot.readString();
        struct.setDescricaoIsSet(true);
      }
      if (incoming.get(3)) {
        struct.peso = iprot.readDouble();
        struct.setPesoIsSet(true);
      }
    }
  }

}

