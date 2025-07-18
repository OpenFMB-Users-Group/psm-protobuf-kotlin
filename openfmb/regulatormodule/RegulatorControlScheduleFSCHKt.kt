// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: regulatormodule/regulatormodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.regulatormodule;

@kotlin.jvm.JvmName("-initializeregulatorControlScheduleFSCH")
public inline fun regulatorControlScheduleFSCH(block: openfmb.regulatormodule.RegulatorControlScheduleFSCHKt.Dsl.() -> kotlin.Unit): openfmb.regulatormodule.RegulatorControlScheduleFSCH =
  openfmb.regulatormodule.RegulatorControlScheduleFSCHKt.Dsl._create(openfmb.regulatormodule.RegulatorControlScheduleFSCH.newBuilder()).apply { block() }._build()
/**
 * ```
 * OpenFMB specialization for control schedule using:  LN: Schedule   Name: FSCH
 * ```
 *
 * Protobuf type `regulatormodule.RegulatorControlScheduleFSCH`
 */
public object RegulatorControlScheduleFSCHKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.regulatormodule.RegulatorControlScheduleFSCH.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.regulatormodule.RegulatorControlScheduleFSCH.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.regulatormodule.RegulatorControlScheduleFSCH = _builder.build()

    /**
     * ```
     * Discrete value in RegulatorCSG type
     * ```
     *
     * `.regulatormodule.RegulatorCSG ValDCSG = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var valDCSG: openfmb.regulatormodule.RegulatorCSG
      @JvmName("getValDCSG")
      get() = _builder.getValDCSG()
      @JvmName("setValDCSG")
      set(value) {
        _builder.setValDCSG(value)
      }
    /**
     * ```
     * Discrete value in RegulatorCSG type
     * ```
     *
     * `.regulatormodule.RegulatorCSG ValDCSG = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearValDCSG() {
      _builder.clearValDCSG()
    }
    /**
     * ```
     * Discrete value in RegulatorCSG type
     * ```
     *
     * `.regulatormodule.RegulatorCSG ValDCSG = 1 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @return Whether the valDCSG field is set.
     */
    public fun hasValDCSG(): kotlin.Boolean {
      return _builder.hasValDCSG()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.regulatormodule.RegulatorControlScheduleFSCH.copy(block: openfmb.regulatormodule.RegulatorControlScheduleFSCHKt.Dsl.() -> kotlin.Unit): openfmb.regulatormodule.RegulatorControlScheduleFSCH =
  openfmb.regulatormodule.RegulatorControlScheduleFSCHKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.regulatormodule.RegulatorControlScheduleFSCHOrBuilder.valDCSGOrNull: openfmb.regulatormodule.RegulatorCSG?
  get() = if (hasValDCSG()) getValDCSG() else null

