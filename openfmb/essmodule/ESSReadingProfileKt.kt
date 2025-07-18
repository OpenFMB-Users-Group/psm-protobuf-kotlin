// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: essmodule/essmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.essmodule;

@kotlin.jvm.JvmName("-initializeeSSReadingProfile")
public inline fun eSSReadingProfile(block: openfmb.essmodule.ESSReadingProfileKt.Dsl.() -> kotlin.Unit): openfmb.essmodule.ESSReadingProfile =
  openfmb.essmodule.ESSReadingProfileKt.Dsl._create(openfmb.essmodule.ESSReadingProfile.newBuilder()).apply { block() }._build()
/**
 * ```
 * ESS reading profile
 * ```
 *
 * Protobuf type `essmodule.ESSReadingProfile`
 */
public object ESSReadingProfileKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.essmodule.ESSReadingProfile.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.essmodule.ESSReadingProfile.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.essmodule.ESSReadingProfile = _builder.build()

    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.ReadingMessageInfo readingMessageInfo = 1 [(.uml.option_parent_message) = true];`
     */
    public var readingMessageInfo: openfmb.commonmodule.ReadingMessageInfo
      @JvmName("getReadingMessageInfo")
      get() = _builder.getReadingMessageInfo()
      @JvmName("setReadingMessageInfo")
      set(value) {
        _builder.setReadingMessageInfo(value)
      }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.ReadingMessageInfo readingMessageInfo = 1 [(.uml.option_parent_message) = true];`
     */
    public fun clearReadingMessageInfo() {
      _builder.clearReadingMessageInfo()
    }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.ReadingMessageInfo readingMessageInfo = 1 [(.uml.option_parent_message) = true];`
     * @return Whether the readingMessageInfo field is set.
     */
    public fun hasReadingMessageInfo(): kotlin.Boolean {
      return _builder.hasReadingMessageInfo()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ESS ess = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var ess: openfmb.commonmodule.ESS
      @JvmName("getEss")
      get() = _builder.getEss()
      @JvmName("setEss")
      set(value) {
        _builder.setEss(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ESS ess = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearEss() {
      _builder.clearEss()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ESS ess = 2 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @return Whether the ess field is set.
     */
    public fun hasEss(): kotlin.Boolean {
      return _builder.hasEss()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.essmodule.ESSReading essReading = 3 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public var essReading: openfmb.essmodule.ESSReading
      @JvmName("getEssReading")
      get() = _builder.getEssReading()
      @JvmName("setEssReading")
      set(value) {
        _builder.setEssReading(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.essmodule.ESSReading essReading = 3 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     */
    public fun clearEssReading() {
      _builder.clearEssReading()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.essmodule.ESSReading essReading = 3 [(.uml.option_required_field) = true, (.uml.option_multiplicity_min) = 1];`
     * @return Whether the essReading field is set.
     */
    public fun hasEssReading(): kotlin.Boolean {
      return _builder.hasEssReading()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.essmodule.ESSReadingProfile.copy(block: openfmb.essmodule.ESSReadingProfileKt.Dsl.() -> kotlin.Unit): openfmb.essmodule.ESSReadingProfile =
  openfmb.essmodule.ESSReadingProfileKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.essmodule.ESSReadingProfileOrBuilder.readingMessageInfoOrNull: openfmb.commonmodule.ReadingMessageInfo?
  get() = if (hasReadingMessageInfo()) getReadingMessageInfo() else null

public val openfmb.essmodule.ESSReadingProfileOrBuilder.essOrNull: openfmb.commonmodule.ESS?
  get() = if (hasEss()) getEss() else null

public val openfmb.essmodule.ESSReadingProfileOrBuilder.essReadingOrNull: openfmb.essmodule.ESSReading?
  get() = if (hasEssReading()) getEssReading() else null

